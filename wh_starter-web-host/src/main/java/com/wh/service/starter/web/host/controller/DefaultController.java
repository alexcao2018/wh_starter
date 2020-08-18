package com.wh.service.starter.web.host.controller;

import com.project.base.web.BaseController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

@ApiIgnore
@RestController
public class DefaultController extends BaseController {

    @GetMapping("/")
    public String index() {
        return "ok";
    }

	@GetMapping("/healthcheck")
    public String healthcheck() {
        System.out.println("caisheng where ");
        return "ok";
    }

	@GetMapping("/favicon.ico")
    void favicon() {
    }
}
