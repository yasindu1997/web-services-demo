package lk.ijse.wsdemo.repository;

import lk.ijse.wsdemo.data.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepo extends CrudRepository<Message, Integer> {
}
