package com.example.books.books.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BooksController {



    @GetMapping("/libros")
    public String libros( ModelMap interfazConPantalla){
        return "libros";
    }



    @GetMapping("/login")
    public String vistalogin( ModelMap interfazConPantalla){
        return "login";
    }
}
