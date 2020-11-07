package lk.ijse.wsdemo.api;

import lk.ijse.wsdemo.data.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class MyRestController {

    @GetMapping(path = "/api/message")
    public Message greeting(@RequestParam("username") String user, @RequestParam("message") String message) {
        Message msg = new Message();
        msg.setSender(user);
        msg.setMessage(message);
        msg.setSentDate(new Date());
        return msg;
    }

    @PostMapping("/api/message")
    public Message createMessage(Message message) {
        System.out.println(message);
        return message;
    }
}

