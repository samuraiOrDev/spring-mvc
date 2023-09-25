package samurai.or.dev.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/app")
public class HomeController {

    @GetMapping({ "/", "/home", "/index" })
    public String home(Model model) {
        String saludo = "Hola buenos días";
        model.addAttribute("title", saludo);
        return "index";
    }

    @GetMapping({ "/home-mv", "/index-mv" })
    public ModelAndView home(ModelAndView mv) {

        String saludo = "Hola buenos días";
        mv.setViewName("index");
        mv.addObject("title", saludo);
        return mv;
    }

}
