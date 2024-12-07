package com.klef.jfsd.exam;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ClientController {

    // Task 1: Display personalized greeting message
    @RequestMapping("/greet")
    public String greet(@RequestParam("username") String username, Model model) {
        model.addAttribute("username", username);
        return "greeting";
    }

    // Task 2: Render the "about" JSP file
    @RequestMapping("/about")
    public String about() {
        return "about";
    }

    // Task 3: Display age and country
    @RequestMapping("/demo1")
    public String demo1(@RequestParam("age") int age, @RequestParam("country") String country, Model model) {
        model.addAttribute("age", age);
        model.addAttribute("country", country);
        return "demo1";
    }

    // Task 4: Arithmetic operations (subtraction and division)
    @RequestMapping("/demo2/{num1}/{num2}")
    public String demo2(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
        int subtraction = num1 - num2;
        double division = num2 != 0 ? (double) num1 / num2 : 0;
        model.addAttribute("subtraction", subtraction);
        model.addAttribute("division", division);
        return "demo2";
    }

    // Task 5: Display product form
    @RequestMapping("/productform")
    public String productForm() {
        return "productform";
    }

    // Task 6: Multiply numbers
    @RequestMapping("/multiplyNumbers")
    public String multiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
        int result = num1 * num2;
        model.addAttribute("result", result);
        return "multiplyNumbers";
    }

    // Task 7: Reverse strings
    @RequestMapping("/reverse")
    public String reverse(@RequestParam("str1") String str1, @RequestParam("str2") String str2, Model model) {
        String reversedStr1 = new StringBuilder(str1).reverse().toString();
        String reversedStr2 = new StringBuilder(str2).reverse().toString();
        model.addAttribute("reversedStr1", reversedStr1);
        model.addAttribute("reversedStr2", reversedStr2);
        return "reverse";
    }

    // Task 8: Subtraction and addition
    @RequestMapping("/calculate")
    public String calculate(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
        int addition = num1 + num2;
        int subtraction = num1 - num2;
        model.addAttribute("addition", addition);
        model.addAttribute("subtraction", subtraction);
        return "calculate";
    }
}
