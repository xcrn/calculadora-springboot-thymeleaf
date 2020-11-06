package br.edu.usj.ads.lpii.calculadora;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;




@Controller
public class Calculadora {
     @PostMapping(value="/result")
    public ModelAndView postResult (@RequestParam String a, @RequestParam String b, @RequestParam String opcao_a, String opcao_b, String opcao_c, String opcao_d) {
    
    
        ModelAndView modelAndView = new ModelAndView("resultado");
        Double aDouble = Double.valueOf(a);
        Double bDouble = Double.valueOf(b);
        Boolean aBoolean = Boolean.valueOf(opcao_a);
        Boolean bBoolean = Boolean.valueOf(opcao_b);
        Boolean cBoolean = Boolean.valueOf(opcao_c);
        Boolean dBoolean = Boolean.valueOf(opcao_d);
        ModelAndView modelAndView1 = new ModelAndView("op");
       

    if (aBoolean) {
        
        Double resultado = aDouble+bDouble;
        String operacao = a + " + " + b + " = "+ resultado;
        String op = "A operação escolhida foi soma.";
        modelAndView.addObject("resultado", operacao);
        modelAndView1.addObject("op", op);
        
        
    }if (bBoolean) {

        Double resultado = aDouble-bDouble;
        String operacao = a + " - " + b + " = "+ resultado;
        String op = "A operação escolhida foi subtração.";
        modelAndView.addObject("resultado", operacao);
        modelAndView1.addObject("op", op);
    
    }if (cBoolean) {

        Double resultado = aDouble/bDouble;
        String operacao = a + " - " + b + " = "+ resultado;
        String op = "A operação escolhida foi divisão.";
        modelAndView.addObject("resultado", operacao);
        modelAndView1.addObject("op", op);
    
    } if (dBoolean) {

        Double resultado = aDouble*bDouble;
        String operacao = a + " - " + b + " = "+ resultado;
        String op = "A operação escolhida foi multiplicação.";
        modelAndView.addObject("resultado", operacao);
        modelAndView1.addObject("op", op);
    
    }
    

        return modelAndView;
    
    
    }
}
   
    
