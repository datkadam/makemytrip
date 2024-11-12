package com.example.makemytrip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Datta {
    @GetMapping("/Datta")
    public String getData() {
        return "Please book hotel Grand Datta from MMT, 50% discount in Whole India";
    }
}
