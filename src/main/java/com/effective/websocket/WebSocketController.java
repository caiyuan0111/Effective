package com.effective.websocket;

import com.effective.common.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

/**
 * @Description
 * @author:caiyuan
 * @date:2019/11/21 0021
 * @ver:1.0
 **/
@Controller
@RequestMapping("/web")
public class WebSocketController {

    @GetMapping("/page/socket")
    public String pageSocket() {
        return "socket";
    }

    @GetMapping("/socket/{cid}")
    public ModelAndView socket(@PathVariable String cid) {
        ModelAndView model = new ModelAndView("/socket");
        model.addObject("cid", cid);
        return model;
    }

    @ResponseBody
    @RequestMapping("/socket/push")
    public Result pushToWeb(String message) {
        try {
            WebSocketServer.sendInfo(message, "1212");
        } catch (IOException e) {
            e.printStackTrace();
            return new Result(500, e.getMessage());
        }
        return new Result(200, "1212");
    }

}
