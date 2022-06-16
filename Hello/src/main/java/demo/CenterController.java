package demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CenterController {
	
	@GetMapping("/Hello")
	public String showHelloWorld() {
		return "Hello World";
	}

}
