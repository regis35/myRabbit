package bzh.redge.receiver;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MyRabbitApplicationTests {

	public void start() throws Exception{/*
		Broker broker = new Broker();
		BrokerOptions brokerOptions = new BrokerOptions();
		brokerOptions.setConfigProperty("qpid.amqp_port", environment.getProperty("spring.rabbitmq.port"));
		brokerOptions.setConfigProperty("qpid.broker.defaultPreferenceStoreAttributes", "{\"type\": \"Noop\"}");
		brokerOptions.setConfigProperty("qpid.vhost", environment.getProperty("spring.rabbitmq.virtual-host"));
		brokerOptions.setConfigurationStoreType("Memory");
		brokerOptions.setStartupLoggedToSystemOut(false);
		broker.startup(brokerOptions);
		*/
	}

	@Test
	void contextLoads() {
	}

}
