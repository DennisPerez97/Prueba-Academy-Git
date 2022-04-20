package com.courses.git.springboothelloworld.controller;

import com.courses.git.springboothelloworld.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
  @Autowired
  HelloWorldService helloWorldService;

  @GetMapping("/api/v1")
  public ResponseEntity<String> hello() {
    return new ResponseEntity<String>(helloWorldService.sayHello(), HttpStatus.OK);
  }
}

