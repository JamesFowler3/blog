package com.example.blog.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MathController {
@RequestMapping("/add/{number}/and/{secondnumber}")
@ResponseBody
    public String Addition(@PathVariable int number, @PathVariable int secondnumber) {
    return number + " plus " + secondnumber + " = " + (number + secondnumber) + "!";
}

@RequestMapping("/subtract/{number}/and/{secondnumber}")
    @ResponseBody
    public String Subtraction(@PathVariable int number, @PathVariable int secondnumber) {
        return number + " minus " + secondnumber + " = " + (number - secondnumber) + "!";
    }

    @RequestMapping("/divide/{number}/and/{secondnumber}")
    @ResponseBody
    public String Division(@PathVariable int number, @PathVariable int secondnumber) {
        return number + " divided by " + secondnumber + " = " + (number / secondnumber) + "!";
    }

    @RequestMapping("/multiply/{number}/and/{secondnumber}")
    @ResponseBody
    public String Multiply(@PathVariable int number, @PathVariable int secondnumber) {
        return number + " times " + secondnumber + " = " + (number * secondnumber) + "!";
    }

}
