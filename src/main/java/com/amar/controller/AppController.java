package com.amar.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * @author amarnath
 * @date 9/11/17
 */
@RestController
@RequestMapping("/")
public class AppController {
    @RequestMapping(value = "name", method = GET)
    public String getName() {
        return "Amar Loves <3 Archana";
    }
}
