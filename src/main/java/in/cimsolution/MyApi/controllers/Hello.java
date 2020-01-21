/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.cimsolution.MyApi.controllers;

import in.cimsolutions.MyApi.responses.ResponseHi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author M.Mozadded
 */
@RestController
public class Hello {

    @GetMapping("/hello")
    public ResponseHi hello() {
        return new ResponseHi();
    }
}
