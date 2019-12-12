package af.asr.test.qrcodegenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

@SpringBootTest
@ComponentScan({ "af.asr.test.*" })
class PhoenixQrcodegeneratorApplicationTests {

	public static void main(String[] args) {
		SpringApplication.run(PhoenixQrcodegeneratorApplicationTests.class, args);
	}
}
