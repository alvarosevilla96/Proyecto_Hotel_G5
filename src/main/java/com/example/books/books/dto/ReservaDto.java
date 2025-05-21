package com.example.books.books.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;



@Getter
@Setter
public class ReservaDto {
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;
    private int Adultos;
}



