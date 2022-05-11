package com.example.javatspfci.code.controller;

import com.example.javatspfci.code.util.FileUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/")
public class TestController {

    @PostMapping("/sendImage")
    public String sendImage(@RequestParam MultipartFile multipartFile) throws IOException {
        return FileUtil.addImg(multipartFile, "C:/Users/Lenovo/Desktop/image");
    }

}
