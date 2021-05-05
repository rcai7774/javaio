package io.example.isthesiteup.controllers.strings;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/echo")
    public String EchoToken(@RequestParam String word){
        return word;
    }

    @GetMapping("/mirror")
    public String MirrorToken(@RequestParam String word){
        String message = "";
        for(int i = word.length()-1; i >= 0; i--){
            message += word.substring(i, i+1);
        }
        return message;
    }
}
