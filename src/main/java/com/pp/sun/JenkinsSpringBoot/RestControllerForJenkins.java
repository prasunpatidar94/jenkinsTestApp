package com.pp.sun.JenkinsSpringBoot;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerForJenkins {

	@GetMapping("/hi")
	public Map<String, Object> hello() {
		Map<String, Object> map = new HashMap<>();
		map.put("code", 1000);
		map.put("value", "Hi prasun 1 after update");
		return map;
	}

}
