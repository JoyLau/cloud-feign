package cn.joylau.cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by JoyLau on 4/25/2017.
 * cn.joylau.cloud
 */
@Controller
public class HandlerController {
    @Autowired
    private FeignInterface feignInterface;

    @RequestMapping("/feign")
    @ResponseBody
    public String handler(){
        return feignInterface.handle();
    }

}
