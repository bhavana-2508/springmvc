package com.klef.jfsd.exam;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ClientController {
    @RequestMapping("/greet")
    public String greet(@RequestParam("username") String username, Model model) {
        model.addAttribute("username", username);
        return "greeting";
    }

    @RequestMapping("/about")
    public String about() {
        return "about";
    }

    @RequestMapping("/demo1")
    public String demo1(@RequestParam("age") int age, @RequestParam("country") String country, Model model) {
        model.addAttribute("age", age);
        model.addAttribute("country", country);
        return "demo1";
    }

    @RequestMapping("/demo2/{x}/{y}")
    public String demo2(@RequestParam("x") int num1, @RequestParam("y") int num2, Model model) {
        int subtraction = x - y;
        double division = y != 0 ? (double) x / y : 0;
        model.addAttribute("subtraction", subtraction);
        model.addAttribute("division", division);
        return "demo2";
    }

    @RequestMapping("/productform")
    public String productForm() {
        return "productform";
    }

    @RequestMapping("/multiplyNumbers")
    public String multiply(@RequestParam("x") int x, @RequestParam("y") int y, Model model) {
        int result = x * y;
        model.addAttribute("result", result);
        return "multiplyNumbers";
    }

    @RequestMapping("/reverse")
    public String reverse(@RequestParam("string1") String string1, @RequestParam("string2") String string2, Model model) {
        String reversedString1 = new StringBuilder(string1).reverse().toString();
        String reversedString2 = new StringBuilder(string2).reverse().toString();
        model.addAttribute("reversedString1", reversedString1);
        model.addAttribute("reversedString2", reversedString2);
        return "reverse";
    }

    @RequestMapping("/calculate")
    public String calculate(@RequestParam("x") int x, @RequestParam("y") int y, Model model) {
        int addition = x + y;
        int subtraction = x - y;
        model.addAttribute("addition", addition);
        model.addAttribute("subtraction", subtraction);
        return "calculate";
    }
}
