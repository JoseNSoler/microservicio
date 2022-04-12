package com.example.demo.service;

import com.example.demo.model.StringModel;
import org.springframework.stereotype.Service;

@Service
public class StringServiceImpl implements IStringService{

    @Override
    public StringModel modify(String original) {
        StringModel modelo = new StringModel();
        modelo.setValue(original.replaceAll(" ", ""));

        return modelo;
    }
}
