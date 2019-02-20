package eurekaclient2.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.web.bind.annotation.*;

/**
 * Created by sunlele
 * Date 2019/2/20 20:26
 * Description
 */
@RestController
public class ComputeController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private DiscoveryClient client;

    @Autowired
    private Registration registration;

    @GetMapping("/add")
    @RequestMapping(value = "/add" ,method = RequestMethod.GET)
    public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
        ServiceInstance instance = (ServiceInstance) client.getInstances(registration.getInstanceId());
        Integer r = a + b;
        logger.info("/add, host:" + instance.getHost() + ", service_id:" + instance.getServiceId() + ", result:" + r);
        return r;
    }
}
