package com.example.books.books.controller;

import com.example.books.books.dto.InfoContacto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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
    public String mostrarPaginaContact(ModelMap intefrazConPantalla) {
        InfoContacto contacto = new InfoContacto();
        contacto.setNombre("El lobo feroz");
        intefrazConPantalla.addAttribute("datoscontacto", contacto);
        return "contact";
    }

    @PostMapping("/contact")
    public String postMostrarPaginaContact(@ModelAttribute(name="datoscontacto") InfoContacto infoContacto) {
        System.out.println(infoContacto.getNombre());

        return "home";
    }
}
