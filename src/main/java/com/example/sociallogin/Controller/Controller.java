package com.example.sociallogin.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping ("/")
    public String home()
    {
        return "hello Home";
    }

    @GetMapping ("/secured")
    public String secure()
    {
        return "hello Secured";
    }

}
