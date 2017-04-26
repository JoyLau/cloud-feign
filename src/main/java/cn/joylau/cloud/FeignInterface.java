package cn.joylau.cloud;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by JoyLau on 4/25/2017.
 * cn.joylau.cloud
 */
@FeignClient(value = "eureka-service-info")
public interface FeignInterface {

    @RequestMapping("/info")
    String handle();
}
