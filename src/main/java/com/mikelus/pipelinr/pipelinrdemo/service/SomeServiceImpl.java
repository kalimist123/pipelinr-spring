package com.mikelus.pipelinr.pipelinrdemo.service;

import org.springframework.stereotype.Service;

@Service
public class SomeServiceImpl implements SomeService{
    @Override
    public String someMessage() {

            return "Message!";
        }
    }

