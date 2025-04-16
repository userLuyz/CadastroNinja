package dev.java10x.CadastroNinja.Ninjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// devemos falar pro spring que isso é um controlador
// utilizar anotaçoes
@RestController
@RequestMapping
public class NinjaController {

   @GetMapping("/boasvindas")
   public String mensagem() {
        return "Hello, World";
    }




}
