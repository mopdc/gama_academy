package br.paixao.spring01.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Clase Controller REST - Vai receber requisições no formato REST
@CrossOrigin("*") //Receber requisições de outras origens. Qualquer outra origem
@RequestMapping("/sample")
public class HelloController {

    @GetMapping("/hello") //Ação HTTP que estou usando: GET
    public String hello(){
         return "Olá mundo!!";
    }
    
}
