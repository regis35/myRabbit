package bzh.redge.sender;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Sender {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @PostConstruct
    public void send() {
        rabbitTemplate.convertAndSend("topic-exchange", "foo.bar.baz", "Hello from RabbitMQ!");
    }
}
