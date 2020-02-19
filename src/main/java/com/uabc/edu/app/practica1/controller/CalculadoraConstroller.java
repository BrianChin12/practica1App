package com.uabc.edu.app.practica1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CalculadoraConstroller {
    @GetMapping("/")
    public String saludito(){
        return"<b> HOLIS !! </b> <br>" + "<div style=\"color:red\">" + "Bienvenido al purgatorio</div>";
    }
@GetMapping("/suma")
public int suma (@RequestParam(value = "num1") int num1, @RequestParam(value = "num2") int num2){
    int res = num1 + num2;
    return res;
}//http://localhost:9090/division?num1=100&num2=10
@GetMapping("/resta")
public int resta (@RequestParam(value = "num1") int num1, @RequestParam(value = "num2") int num2){
    int res = num1 - num2;
    return res;
}
@GetMapping("/multiplicacion")
public int multiplicacion (@RequestParam(value = "num1") int num1, @RequestParam(value = "num2") int num2){
    int res = num1 * num2;
    return res;
}
@GetMapping("/division")
public int division (@RequestParam(value = "num1") int num1, @RequestParam(value = "num2") int num2){
    int res = num1 / num2;
    return res;
}
@GetMapping("/cuadrado")
    public int cuadrado (@RequestParam(value = "num1") int num1){
    return num1 * num1;
    }

    @GetMapping("/porcentaje")
    public int porcentaje (@RequestParam(value = "num1") int num1, @RequestParam(value = "num2") int num2){
        int res = (num1 * num2) / 100;
        return res;
    }
}
