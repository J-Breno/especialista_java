package com.github.jbreno.agencia;

import java.util.ArrayList;

public class CadastroHotel {
    private final ArrayList<Hotel> hotels = new ArrayList<>();

    public void adicionarHotel(Hotel hotel) {
        hotels.add(hotel);
    }
}
