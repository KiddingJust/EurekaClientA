package org.kidding.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RpcController {

    @GetMapping("/serviceACheck")
    public String checkState() {
        return "Service-A: 정상";
    }
    
//    @Autowired
//    private RestTemplate restTemplate;
//
//    private static final String SERVICE_B_NAME = "SERVICE-B";
//
//    @GetMapping("/healthcheck")
//    public String callServiceB() {
//        ResponseEntity<String> ackMessage;
//        String apiPath = "/api/healthcheck";
//
//        ackMessage = restTemplate.getForEntity("http://" + SERVICE_B_NAME + apiPath, String.class);
//
//        return "Service-A: inst001 호출" + " > " + ackMessage.getBody();
//    }

}
