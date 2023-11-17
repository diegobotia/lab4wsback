package com.taxi.taxi.Controller;

import com.taxi.taxi.model.Coordenadas;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class CoordenadaController {

    @MessageMapping("/taxi")
    @SendTo("/taxi/coordenada")
    public Coordenadas envio(Coordenadas coordenada){
        return coordenada;
    }

}
