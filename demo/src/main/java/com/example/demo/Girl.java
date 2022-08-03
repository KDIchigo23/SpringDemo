package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Girl {
    // @Autowired
    IOutfit outfit;

    // String name;

    // @Autowired
    public Girl(@Qualifier("bikini") IOutfit outfit) {
       System.out.println("contructor");
        this.outfit = outfit;
    }

    // public Girl(String name) {
    //     System.out.println("contructor");
    //      this.name = name;
    // }
    
    // @Autowired
    // public void setOutfit(IOutfit outfit){
    //     System.out.println("setter");
    //     this.outfit = outfit;
    // }
}
