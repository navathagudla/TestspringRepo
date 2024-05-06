package com.cbt.testspring1apr24;
import org.springframework.context.annotation.*;

@Configuration
public class AppConfig {

    @Bean
    @Lazy
    @Primary
    public MyNumber getMyNumOne()
    {
        MyNumber myNumber = new MyNumber();
        myNumber.setNum(76);
        return myNumber;
    }

    @Bean
    @Lazy
    public MyNumber getMyNumTwo()
    {
        MyNumber myNumber = new MyNumber();
        myNumber.setNum(76);
        return myNumber;
    }

}
