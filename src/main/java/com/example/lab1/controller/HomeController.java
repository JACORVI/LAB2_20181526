package com.example.lab1.controller;

import com.example.lab1.bean.Ahorcado;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    @RequestMapping(value = "/" , method = RequestMethod.GET)
    @ResponseBody
    public String paginaPrincipal() {
        return "Hello World";
    }
    @GetMapping(value ="/Home")
    public String home(Model model) {
        Ahorcado ahorcado = new Ahorcado();
        ArrayList<Ahorcado> ahorcados = new ArrayList<>();
        model.addAttribute("ahorcados", ahorcado);
        return "Inicio";
    }
    @PostMapping(value= "/Formulario")
    @ResponseBody
        public String formulario(Model model, @RequestParam("longitud")  Integer longitud,@RequestParam("num") Integer num, @RequestParam("temas") List<String> temas ) {

        Ahorcado ahorcado = new Ahorcado(longitud, num, temas);

        return "Juego";
    }


}
