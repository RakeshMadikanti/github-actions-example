package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootTest
@RestController
class GithubCicdActionsApplicationTests {
	
	@GetMapping("/welcome")
	public String welcome() {
		return "Github CI/CD Sample Demo";
	}

	@Test
	void contextLoads() {
	}

}


//echo "# github-actions-example" >> README.md
//git init
//git add README.md
//git commit -m "first commit"
//git branch -M main
//git remote add origin https://github.com/RakeshMadikanti/github-actions-example.git
//git push -u origin main