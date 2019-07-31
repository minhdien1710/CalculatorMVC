package controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class CalculateController {
    @GetMapping("/calculator")
    public String Calculator(@RequestParam(value = "firstOperand",required = false, defaultValue = "0")String firstOperand,
                             @RequestParam(value = "secondOperand", required = false, defaultValue = "0") String secondOperand,
                             @RequestParam("operator") String operator, Model model){
        float result = 0;
        switch (operator){
            case "add(+)":
                result = Float.parseFloat(firstOperand)+ Float.parseFloat(secondOperand);
                break;
            case ("sub(-)"):
                result = Float.parseFloat(firstOperand)- Float.parseFloat(secondOperand);
                break;
            case ("multi(-)"):
                result = Float.parseFloat(firstOperand)*Float.parseFloat(secondOperand);
                break;
            case ("div(/)"):
                result = Float.parseFloat(firstOperand)/Float.parseFloat(secondOperand);
                break;
        }
        model.addAttribute("result", result);
        return "index";
    }
    @GetMapping("/")
    public String check(){
        return "index";
    }

}
