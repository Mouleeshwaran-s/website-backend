package com.md.v1.service;

import com.md.v1.repo.AppRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppService {

    public String test() {
        return "Hello World";
    }
}
