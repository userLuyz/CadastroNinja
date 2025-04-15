package dev.java10x.CadastroNinja;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// devemos falar pro spring que isso é um controlador
// utilizar anotaçoes
@RestController
@RequestMapping
public class Controller {

   @GetMapping("/boasvindas")
   public String mensagem() {
        return "Hello, World";
    }




}
