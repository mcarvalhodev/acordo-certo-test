package br.com.acordocerto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = BasePackageScan.class)
public class AcordoCertoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AcordoCertoApplication.class, args);
	}
}
