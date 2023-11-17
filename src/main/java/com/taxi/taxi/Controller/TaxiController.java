package com.taxi.taxi.Controller;

import com.taxi.taxi.model.Coordenadas;
import org.springframework.core.SpringVersion;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/taxiapp")
public class TaxiController {
   private final SimpMessagingTemplate template;

   public TaxiController(SimpMessagingTemplate template){
       this.template= template;
   }

   @PostMapping("/send-coordenada")
    public void sendCoordenada(@RequestBody Coordenadas coordenada){
       this.template.convertAndSend("/taxi/coordenada", coordenada);
   }

}
