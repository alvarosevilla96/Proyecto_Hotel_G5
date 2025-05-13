package com.example.books.books.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HotelesController {
    @GetMapping("/")
    public String vistaHome( ModelMap interfazConPantalla){
        return "home";
    }

    @GetMapping("/reserva")
    public String reserva( ){
        return "reservaCompleta";
    }

    @GetMapping("/servicios")
    public String vistaservicios( ){
        return "services";
    }

    @GetMapping("/login2")
    public String msotrarLogin( ){
        return "login2";
    }

    @GetMapping("/crear-cuenta")
    public String mostrarCrearCuenta( ){
        return "crear_cuenta";
    }

    @GetMapping("/userhome")
    public String mostrarUserHome( ) {
        return "user_home_page";
    }

    @GetMapping("/hoteles")
    public String mostrarHoteles( ){
        return "hoteles_web";
    }

    @GetMapping("/contact")
    public String mostrarPaginaContact( ) {
        return "contact";
    }
}
