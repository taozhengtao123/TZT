package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	
	@RequestMapping("/page/{name}")
	public String page(@PathVariable String name) {
		System.out.println("111");
		return name;
	}
}
