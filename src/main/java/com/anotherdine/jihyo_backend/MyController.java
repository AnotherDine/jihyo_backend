package com.anotherdine.jihyo_backend;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@CrossOrigin(origins = "http://jhkim-frontend-cicd-bucket.s3-website.ap-northeast-2.amazonaws.com/")
@RequestMapping("/api")
public class MyController {
    @GetMapping("/data")
    public String getData() {
        return "nginx!";
    }
}