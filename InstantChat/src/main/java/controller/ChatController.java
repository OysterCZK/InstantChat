package controller;

import entity.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import utils.WebSocketServer;

import java.io.IOException;

@RestController
@RequestMapping("/chatroom/msg")
public class ChatController {
    @PostMapping("/sendMsg")
    public R sendMsg(String msg) throws IOException {
        WebSocketServer.sendInfo(msg);
        return R.ok().message("发送成功");
    }

    @GetMapping("/test")
    public String test(){
        return "123123";
    }
}