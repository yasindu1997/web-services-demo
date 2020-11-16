package lk.ijse.wsdemo.api;

import lk.ijse.wsdemo.data.Message;
import lk.ijse.wsdemo.repository.MessageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping(path = "/api/message")
public class MessageController {
    @Autowired
    private MessageRepo messageRepo;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity saveMsg(@RequestBody Message message) {
        messageRepo.save(message);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getAllMsgs() {
        ArrayList<Message> all = new ArrayList<>();
        for (Message m : messageRepo.findAll()) {
            all.add(m);
        }
        return new ResponseEntity<Object>(all, HttpStatus.OK);
    }
}
