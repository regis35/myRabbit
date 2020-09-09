package bzh.redge.sender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SenderRabbitApplication {

	@Autowired
	private Sender sender;

	public static void main(String[] args) throws InterruptedException {

		SpringApplication.run(SenderRabbitApplication.class, args).stop();
	}

}
