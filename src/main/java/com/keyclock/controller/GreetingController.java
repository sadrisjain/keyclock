package com.keyclock.controller;

import javax.annotation.security.RolesAllowed;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class GreetingController {

    @RequestMapping(value = "/member", method = RequestMethod.GET)
    @RolesAllowed("member")
    public ResponseEntity<String> getMember() {
        return ResponseEntity.ok("Hello Member");
    }

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    @RolesAllowed("admin")
    public ResponseEntity<String> getAdmin() {
        return ResponseEntity.ok("Hello Admin");
    }

}