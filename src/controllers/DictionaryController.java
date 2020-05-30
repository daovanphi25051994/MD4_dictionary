package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import service.TranslateService;

import java.util.Map;

@Controller
public class DictionaryController {
    @GetMapping("/dictionary")
    public ModelAndView showTranslation(){
        ModelAndView modelAndView = new ModelAndView("dictionary");
        return modelAndView;
    }
    @PostMapping("/dictionary")
    public ModelAndView translation(@RequestParam String english){
        ModelAndView modelAndView = new ModelAndView("dictionary");
        TranslateService translateService = new TranslateService();
        String value = translateService.getValueByKey(english);
        modelAndView.addObject("vietnamese", value);
        return modelAndView;
    }
}
