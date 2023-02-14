package co.develhope.swagger2.controllers;

import co.develhope.swagger2.entities.ArithmeticOperation;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/math")
public class MathController {

    @GetMapping("welcome-message")
    @ApiOperation(value = "Say welcome message", notes = "Print welcome message for anyone visit localhost:5050/math")
    public String welcomeMathMsg(){
        return "welcome in the math controller";
    }

    @GetMapping("division-info")
    @ApiOperation(value = "Get arithmetic operation info",
                  notes = "prints all details of the division")
    public ArithmeticOperation getArithmeticOperationInfo(){
        return new ArithmeticOperation("division", 2, "Division is an operation that associates two numbers, called dividend and divisor, with two other numbers called quotient and remainder, " +
                                       "so that the sum of the remainder and the product of " +
                                       "quotient and divisor is equal to the dividend.", new String[]{"distributive", "invariant"});
    }

    @GetMapping("multiplication")
    @ApiOperation(value = "get multiplication",
                  notes = "returns the multiplication of two numbers")
    public Integer getMultiplication(@ApiParam(value = "first number") @RequestParam Integer a,
                                     @ApiParam(value = "second number")@RequestParam Integer b){
        return a*b;
    }

    @GetMapping("square/{n}")
    @ApiOperation(value = "get square",
                   notes = "return the square of the number")
    public Integer getSquare(@ApiParam(value = "the number")@PathVariable int n){
        return n*n;
    }
}