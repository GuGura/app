package com.folder.app.controller;

import com.folder.app.dto.ResultDTO;
import com.folder.app.dto.UserDTO;
import com.folder.app.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class DataController {

    private final UserService userService;

    public DataController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String home() {
        return "Data 준비 중";
    }

    @GetMapping("/api")
    public String api() {
        return "Api Data 준비 중";
    }

    @PostMapping("/findAll")
    public ResultDTO findAll() {
        return userService.findAll();
    }

    @PostMapping("/editById")
    public ResultDTO editById(@RequestBody UserDTO uDto) {
        return userService.editById(uDto);
    }

    @DeleteMapping("/delete")
    public ResultDTO delete(@RequestParam("no") int no) {
        System.out.println("no: " + no);
        return userService.delete(no);
    }

    @PutMapping("/save")
    public ResultDTO save(@RequestBody UserDTO uDto) {
        return userService.save(uDto);
    }
}
