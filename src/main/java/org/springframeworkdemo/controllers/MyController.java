package org.springframeworkdemo.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController
{
    public String doGreeting()
    {
        return "Hello !!!";
    }
}
