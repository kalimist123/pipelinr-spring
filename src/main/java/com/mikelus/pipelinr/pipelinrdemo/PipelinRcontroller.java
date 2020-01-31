package com.mikelus.pipelinr.pipelinrdemo;

import an.awesome.pipelinr.Pipeline;
import com.mikelus.pipelinr.pipelinrdemo.domain.Ping;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
class PipelineRController {


    Pipeline pipeline;

    @Autowired
    public PipelineRController(Pipeline pipeline) {
        this.pipeline = pipeline;
    }

    @GetMapping(path = "/pipelinr/boom")
    void pipelinRit() {
        pipeline.send(new Ping("champs"));

    }


}

