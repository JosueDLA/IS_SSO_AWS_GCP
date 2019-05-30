package gt.edu.umg.ingenieria.antigua.calculadora.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicOperations {
    @GetMapping("/sumar")
    public int sumar(@RequestParam(name="a", required=true) int a, @RequestParam(name="b", required=true) int b){
        return a+b;
    }
    
    @GetMapping("/restar")
    public int restar(@RequestParam(name="a", required=true) int a, @RequestParam(name="b", required=true) int b){
        return a-b;
    }
    
    @GetMapping("/multiplicar")
    public int multiplicar(@RequestParam(name="a", required=true) int a, @RequestParam(name="b", required=true) int b){
        return a*b;
    }
    
    @GetMapping("/dividir")
    public float dividir(@RequestParam(name="a", required=true) int a, @RequestParam(name="b", required=true) int b){
        return a/b;
    }
}
