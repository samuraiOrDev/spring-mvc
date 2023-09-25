package samurai.or.dev.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/params")
public class ParamsController {

    @GetMapping({ "/", "" })
    public ModelAndView params(@RequestParam(required = false) String texto,
            @RequestParam(required = false) Integer age,
            @RequestParam(required = false) String saludos,
            ModelAndView mv) {
        mv.setViewName("params");
        mv.addObject("title", "Params");
        if (texto != null) {
            mv.addObject("texto", texto);
        } else {
            mv.addObject("texto", "El parámetro texto no ha sido informado");
        }
        if (age != null) {
            mv.addObject("age", age);
        } else {
            mv.addObject("age", "El parámetro age no ha sido informado");
        }
        if (saludos != null) {
            mv.addObject("saludos", saludos);
        } else {
            mv.addObject("saludos", "El parámetro saludos no ha sido informado");
        }
        return mv;

    }

}
