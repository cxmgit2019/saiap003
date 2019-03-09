package jp.zr.scsk.testheroku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@SpringBootApplication
@Controller
public class HelloherokuApplication {
	
	public static void main(String[] args) {
	    SpringApplication.run(HelloherokuApplication.class, args);
	}

	 @RequestMapping(value = "/", method = RequestMethod.GET)
	String index() {
		return "index";
	}

}
