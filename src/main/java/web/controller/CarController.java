package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarController {

    CarService service = new CarService();
    @GetMapping(value = "cars")
    public String show(@RequestParam(defaultValue = "5") int count, Model model){
        model.addAttribute("cars", service.getCarByCount(count));
        return "cars";
    }
}
