package com.example.demo;

import org.springframework.stereotype.Component;

@Component("bikini")
public class Bikini implements IOutfit {
    public void wear() {
        System.out.println("Dang mac Bikini");
    }

}
