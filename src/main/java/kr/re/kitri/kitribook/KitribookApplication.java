package kr.re.kitri.kitribook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@SpringBootApplication
public class KitribookApplication {

	public static void main(String[] args) {
		SpringApplication.run(KitribookApplication.class, args);
	}

}
