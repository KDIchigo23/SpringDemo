package com.example.demo;

// import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("naked")
// @Primary
public class Naked implements IOutfit{

    @Override
    public void wear() {
        System.out.println("Dang khong mac gi");
        
    }
    
}
