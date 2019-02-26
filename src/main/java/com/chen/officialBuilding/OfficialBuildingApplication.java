package com.chen.officialBuilding;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * 这个类是启动类,一般不写其他方法
 * @author chen
 *
 */
@SpringBootApplication
@Controller
public class OfficialBuildingApplication {

	public static void main(String[] args) {
		SpringApplication.run(OfficialBuildingApplication.class, args);
	}
}
