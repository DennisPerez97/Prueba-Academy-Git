package com.courses.git.springboothelloworld.bussiness;

import com.courses.git.springboothelloworld.constants.Messages;
import com.courses.git.springboothelloworld.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldBussiness implements HelloWorldService {

  @Autowired
  Messages mensajes;

  @Override
  public String sayHello() {
    return mensajes.getHelloMesage();
  }
}
