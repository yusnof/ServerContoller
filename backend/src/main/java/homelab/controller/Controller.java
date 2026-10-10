package homelab.controller;


import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class Controller {


    DockerService dockerService;

    public Controller(DockerService dockerService) {
        this.dockerService = dockerService;
    }





    @GetMapping(value = "/v1")
    public String getTestData() {
        return this.dockerService.test();
    }
}
