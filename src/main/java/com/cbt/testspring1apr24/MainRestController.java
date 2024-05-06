package com.cbt.testspring1apr24;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {

    @Autowired
    MyNumber number1;

    @Autowired
    MyNumber number2;

    @GetMapping("greet")
    public String greet()
    {
        return "Hello World";
    }

    @GetMapping("get/numberone")
    public MyNumber getNumberOne() {
        number1.increment();
        return number1;
    }

    @GetMapping("get/numbertwo")
    public MyNumber getNumberTwo() {
        return number2  ;
    }
}
