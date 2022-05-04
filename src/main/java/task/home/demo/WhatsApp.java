package task.home.demo;

import org.springframework.stereotype.Component;

@Component
public class WhatsApp implements Mesenger{
    @Override
    public void sendMessage() {
        System.out.println("WhatsApp отправил сообщение");
    }
}
