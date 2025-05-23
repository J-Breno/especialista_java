package com.github.jbreno.agencia;

import java.util.ArrayList;

public class CadastroHotel {
    private final ArrayList<Hotel> hotels = new ArrayList<>();

    public void adicionarHotel(Hotel hotel) {
        if(hotels.contains(hotel)) {
            throw new RuntimeException("Hotel já existente");
        }

        hotels.add(hotel);
    }
}
