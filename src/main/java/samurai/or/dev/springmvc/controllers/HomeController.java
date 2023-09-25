package samurai.or.dev.springmvc.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import samurai.or.dev.springmvc.models.User;

@Controller
@RequestMapping("/app")
public class HomeController {

    @Value("${title.controller.Home}")
    private String titleHome;

    @Value("${title.controller.Profile}")
    private String titleProfile;

    @Value("${title.controller.List}")
    private String titleList;

    @ModelAttribute("users")
    public List<User> getUsers() {
        return new ArrayList<>(Arrays.asList(
                new User("Samurai", "Ordiales", 28),
                new User("Reina", "Ordiales", 21),
                new User("Sparky", "Ordiales", 77)));
    }

    @GetMapping({ "/", "/home", "/index" })
    public String home(Model model) {
        model.addAttribute("title", titleHome);
        return "index";
    }

    @GetMapping({ "/home-mv", "/index-mv" })
    public ModelAndView home(ModelAndView mv) {
        mv.setViewName("index");
        mv.addObject("title", titleHome);
        return mv;
    }

    @GetMapping(value = "/profile")
    public ModelAndView showProfile(ModelAndView mv) {
        User user = new User("Samurai", "Ordiales García", 28);
        mv.setViewName("profile");
        mv.addObject("title", titleProfile);
        mv.addObject("user", user);
        return mv;
    }

    @GetMapping(value = "/list")
    public ModelAndView showList(ModelAndView mv) {
        mv.setViewName("list");
        mv.addObject("title", titleList);
        return mv;

    }

}
