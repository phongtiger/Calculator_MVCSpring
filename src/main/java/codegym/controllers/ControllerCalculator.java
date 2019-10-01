package codegym.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class ControllerCalculator {
    @GetMapping("/index")
    String home() {
        return "index";
    }
    @PostMapping("/calculate")
    public String calculate(double firstOperand,
                            double secondOperand,
                            String operator,
                            ModelMap model) {
        double result = 0;
        switch (operator) {
            case "+": {
                result = firstOperand + secondOperand;
                operator = "Addition";
                break;
            }
            case "-": {
                result = firstOperand - secondOperand;
                operator = "Subtraction";
                break;
            }
            case "*": {
                result = firstOperand * secondOperand;
                operator = "Multiplication";
                break;
            }
            case "/": {
                result = firstOperand / secondOperand;
                operator = "Division";
                break;
            }
        }
        model.addAttribute("result", result);
        model.addAttribute("operator", operator);
        model.addAttribute("firstOperand", firstOperand);
        model.addAttribute("secondOperand", secondOperand);
        return "index";
    }

}
