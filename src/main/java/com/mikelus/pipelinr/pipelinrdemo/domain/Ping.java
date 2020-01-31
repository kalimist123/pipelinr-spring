package com.mikelus.pipelinr.pipelinrdemo.domain;

import an.awesome.pipelinr.Command;
import an.awesome.pipelinr.Voidy;

public class Ping implements Command<Voidy> {

    public final String host;

    public Ping(String host) {
        this.host = host;
    }
}