package co.develhope.swagger2.controllers;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/default")
public class DefaultController {

    @GetMapping("")
    @ApiOperation(value = "Say welcome message", notes = "Print welcome message for anyone visit localhost:5050/default")
    public String welcomeMessage(){
        return "Welcome dear visitor!";
    }
}