package com.example.javatspfci.code.controller;

import com.example.javatspfci.code.util.FileUtil;
import org.springframework.web.bind.annotation.*;
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
