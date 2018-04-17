package com.example.blog.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {
    //    @GetMapping("/landing")
//    @ResponseBody
//    public String Landing () {
//        return "This is a landing page!";
//    }
//    @GetMapping("/home")
//    public String welcome() {
//        return "home";
//    }
    @GetMapping("/hello/{name}")
    public String sayHello (@PathVariable String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }
    @GetMapping("/roll-dice")
    public String rollDice() {
        return "roll_dice";
    }

//    @GetMapping("/roll-dice/{number}")
//    public String diceRolled(@PathVariable int number, Model model) {
//       model.addAttribute("number", number);
//        return "dice_rolled";
//    }
    @GetMapping("/roll-dice/{number}")
    public String dieRoll(@PathVariable int number, Model model) {
        model.addAttribute("number", number);
        int die = (int) (Math.random()*6) + 1;
        model.addAttribute("die", die);
        return "dice_rolled";
    }

}
//    @GetMapping("/")
//    public String numbersOnDie(Model model) {
//
//    }
//}

