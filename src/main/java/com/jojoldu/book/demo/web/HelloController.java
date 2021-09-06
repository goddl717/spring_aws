package com.jojoldu.book.demo.web;

import com.jojoldu.book.demo.web.dto.HelloResponseDto;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;


@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello()
    {
        return "hello";
    }
    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto (@RequestParam ("name") String name,
                                      @RequestParam("amount") int amount){
        return new HelloResponseDto(name,amount);
    }
}
