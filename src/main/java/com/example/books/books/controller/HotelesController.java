package com.example.books.books.controller;

import com.example.books.books.dto.*;
import com.example.books.books.services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


@Controller
public class HotelesController {


    private final EmailService emailService;

    @Autowired
    public HotelesController(EmailService emailService)  {
        this.emailService = emailService;
    }
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

    @GetMapping("/login")
    public String mostrarLogin(Model model){
        LoginDto loginDto = new LoginDto();
        loginDto.setEmail("test@ejemplo.com");
        model.addAttribute("datoslogin", loginDto);
        return "login";
    }

    @PostMapping("/login")
    public String postLogin(@ModelAttribute(name="datoslogin") LoginDto login){
        System.out.println(login.getEmail());
        return "user_home_page";
    }


    @GetMapping("/crear_cuenta")
    public String mostrarCrearCuenta(Model model ){
        UserDto userDto = new UserDto();
        model.addAttribute("userData", userDto);
        return "crearCuenta";
    }

    @PostMapping("/crear-cuenta")
    public String postCrearCuenta(@ModelAttribute(name = "userData") UserDto user){
        System.out.println(user.getName());
        System.out.println(user.getEmail());
        System.out.println(user.getPassword());
        return "home";
    }

    @GetMapping("/userhome")
    public String mostrarUserHome( ) {
        return "user_home_page";
    }

    @GetMapping("/hoteles")
    public String mostrarHoteles(Model model ){
        List<HotelDto> hotels = HotelsData.hotelsDataList();
        model.addAttribute("hotels", hotels);

        return "hoteles_web";
    }

    @GetMapping("/contact")
    public String mostrarPaginaContact(ModelMap intefrazConPantalla) {
        ContactDto contacto = new ContactDto();
        contacto.setName("El lobo feroz");
        intefrazConPantalla.addAttribute("datoscontacto", contacto);
        return "contact";
    }

    @PostMapping("/contact")
    public String postMostrarPaginaContact(@ModelAttribute(name="datoscontacto") ContactDto infoContacto) {
        System.out.println(infoContacto.getName());
        System.out.println(infoContacto.getMessage());

        emailService.sendEmail(
                "alba2gr@gmail.com",
                "Correo de prueba",
                "Este es un mensaje de prueba.\n\n" +
                        "Nombre: " + infoContacto.getName() + "\n" +
                        "Email: " + infoContacto.getEmail() + "\n" +
                        "Teléfono: " + infoContacto.getPhoneNumber() + "\n" +
                        "Departamento " + infoContacto.getDepartment() + "\n" +
                        "Mensaje: " + infoContacto.getMessage()
        );
        return "home";
    }


}
