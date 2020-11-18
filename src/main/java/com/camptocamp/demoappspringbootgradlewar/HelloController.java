package com.camptocamp.demoappspringbootgradlewar;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import com.camptocamp.demo_app_springboot_gradle_war.BuildConfig;


@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
        return "<p>Greetings from : " + BuildConfig.APP_NAME + "</p>\n" + 
        "<p>Git Reference  : " + BuildConfig.GIT_COMMIT_HASH + "</p>\n" + 
        "<p>Build Date     : " + BuildConfig.BUILD_DATE + "</p>\n";
	}
}