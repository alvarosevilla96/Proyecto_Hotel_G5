package com.example.books.books.dto;

import java.util.ArrayList;
import java.util.List;

public class HotelsData {

    public static List<HotelDto> hotelsDataList()
    {
        List<HotelDto> list = new ArrayList<>();

        list.add(new HotelDto(
                "Hotel Montaña Abajo",
                "Barcelona",
                "Paraiso montaña | Gran ubicación.",
                89.99,
                "Hotel 1 es una de las mejores opciones para disfrutar de una estancia en Barcelona.",
                "https://picsum.photos/600/400?random=5",
                List.of("Montañas pequeñas", "Escalada divertida", "Helicoptero privado")
        ));

        list.add(new HotelDto(
                "Hotel La playa tu vecina",
                "Madrid",
                "Playa gigante | Plaza Mayor.",
                99.99,
                "Hotel La playa de tu vecina es una gran opcion playera.",
                "https://picsum.photos/600/400?random=2",
                List.of("Playa a 15 minutos", "Piscina monstruosa", "Barco propio")
        ));

        list.add(new HotelDto(
                "Hotel Ciudad de humo",
                "Sevilla",
                "Paraiso en la ciudad | Ubicacion apasionante.",
                30,
                "Hotel de la ciudad es una de las mejores opciones para disfrutar de una estancia en Sevilla.",
                "https://picsum.photos/600/400?random=7",
                List.of("No tenemos playa", "No tenemos piscina", "Tenemos un estanco cerca")
        ));

        return list;
    }

}
