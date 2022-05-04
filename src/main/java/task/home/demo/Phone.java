package task.home.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Service;

@Service
public class Phone implements InitializingBean, DisposableBean {
    Telegram telegram;
    WhatsApp whatsApp;

    public Phone(Telegram a, WhatsApp b){
        this.telegram = a;
        this.whatsApp = b;
    }

    public void sendMessage(){
        telegram.sendMessage();
        whatsApp.sendMessage();
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Создался бин 'Phone'");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Бин 'Phone' уничтожился");
    }
}
