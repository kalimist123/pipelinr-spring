package com.mikelus.pipelinr.pipelinrdemo.domain;

import an.awesome.pipelinr.Command;
import an.awesome.pipelinr.Voidy;

import com.mikelus.pipelinr.pipelinrdemo.service.SomeService;
import org.springframework.stereotype.Component;

@Component
class PingHandler implements Command.Handler<Ping, Voidy> {

    final
    SomeService someService;

    public PingHandler(SomeService someService) {
        this.someService = someService;
    }

    @Override
    public Voidy handle(Ping command) {
        String host = command.host;
        // ... ping logic here ...

        String thing = someService.someMessage();
        return new Voidy();
    }
}
