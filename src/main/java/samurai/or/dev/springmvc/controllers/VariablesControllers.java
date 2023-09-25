package samurai.or.dev.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequestMapping("/variables")
public class VariablesControllers {

    @GetMapping(value = "/string/{texto}")
    public ModelAndView variables(@PathVariable String texto, ModelAndView mv) {

        mv.setViewName("variables");
        mv.addObject("title", "Variables");
        return mv;
    }

    @GetMapping(value = "/string/{texto}/{number}")
    public ModelAndView variables(@PathVariable String texto, @PathVariable Integer number, ModelAndView mv) {
        mv.setViewName("variables");
        mv.addObject("title", "Variables");
        return mv;
    }

}
