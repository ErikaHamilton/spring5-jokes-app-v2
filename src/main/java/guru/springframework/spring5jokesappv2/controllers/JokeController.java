package guru.springframework.spring5jokesappv2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.spring5jokesappv2.services.JokeService;

@Controller
public class JokeController {

    private final JokeService jokeService;
    //with a single constructor spring auto injects this
   
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }
    
    @RequestMapping({"/", ""})
    public String showJoke(Model model){
        model.addAttribute("joke", jokeService.getJoke());

        return "index";
    }
}
