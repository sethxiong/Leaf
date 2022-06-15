package com.sankuai.inf.leaf.server;

import com.alibaba.dubbo.container.Main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LeafServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(LeafServerApplication.class, args);
		Main.main(args);
	}
}
