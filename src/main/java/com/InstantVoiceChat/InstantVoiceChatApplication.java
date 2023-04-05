package com.InstantVoiceChat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="controller")
public class InstantVoiceChatApplication {

    public static void main(String[] args) {
        SpringApplication.run(InstantVoiceChatApplication.class, args);
    }

}
