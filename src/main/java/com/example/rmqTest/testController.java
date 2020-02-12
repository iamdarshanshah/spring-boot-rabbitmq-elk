package com.example.rmqTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.rmqTest.Publisher;

@RestController
public class testController {
   
   @Autowired
   Publisher publisher;
   @RequestMapping("/send")
   public String sendMessage(@RequestParam("msg") String msg){
      System.out.println("*****"+msg);
      for(int i =0; i<25;i++){
      publisher.produceMsg(msg);
      }
      return "Successfully Msg Sent";
   }
}