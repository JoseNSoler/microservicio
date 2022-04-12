package com.example.demo.controller;

import com.example.demo.model.StringModel;
import com.example.demo.service.StringServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/stringModify")
public class StringController {
    @Autowired
    private StringServiceImpl stringService;

    @GetMapping("/noSpace/{String}")
    public ResponseEntity<StringModel> modifyString(@PathVariable("String") String string){
        return new ResponseEntity(stringService.modify(string), HttpStatus.CREATED);
    }




}
