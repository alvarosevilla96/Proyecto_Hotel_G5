package com.example.books.books.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EjemploController {
    @GetMapping("/")
    public String vistaHome( ModelMap interfazConPantalla){
        return "index";
    }
    @GetMapping("/prueba")
    public String vistaprueba( ){
        return "prueba_inicial";
    }

    @GetMapping("/prueba2")
    public String vistaprueba2( ){
        return "prueba/prueba_secundaria";
    }

    @GetMapping("/prueba3")
    public String vistaprueba3( ){
        return "prueba/prueba_3";
    }

    @GetMapping("/prueba4")
    public String vistaprueba4( ){
        System.out.println("Pase por prueba 4 y me voy a prueba 3");
        return "redirect:/prueba3";
    }

    @GetMapping("/starter")
    public String vistastarter( ){
        return "starter-page";
    }
    @GetMapping("/gatitos")
    public String vistagatitos( ){
        return "animales/gatitos";
    }
    @GetMapping("/perritos")
    public String vistaperritos( ){
            return "animales/perritos";
    }

    @GetMapping("/servicios")
    public String vistaservicios( ){
        return "services";
    }

    @GetMapping("/logout")
    public String vistalogout( ){
        return "logout";
    }
}
