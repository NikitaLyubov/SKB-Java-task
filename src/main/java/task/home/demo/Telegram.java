package task.home.demo;

import org.springframework.stereotype.Component;

@Component
public class Telegram implements Mesenger {

    @Override
    public void sendMessage() {
        System.out.println("Отправилось сообщение в телеграмме");
    }
}
