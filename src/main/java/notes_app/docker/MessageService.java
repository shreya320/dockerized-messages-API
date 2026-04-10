package notes_app.docker;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    @Autowired
    MessageRepo messageRepo;

    public void newMessage(Message message) {
        messageRepo.save(message);
    }

    public List<Message> getAllMessages() {
        return messageRepo.findAll();
    }

    public void deleteMessage(Integer id) {
        messageRepo.deleteById(id);
    }
}
