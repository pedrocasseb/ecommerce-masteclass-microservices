package com.info.configdemo;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@AllArgsConstructor
@RefreshScope
public class BuildInfoController {

    private BuildInfo buildInfo;

    @GetMapping("/build-info")
    public String getBuildInfo() {
        log.info("Build Id: {}, Version: {}, Name: {}", buildInfo.getId(), buildInfo.getVersion(), buildInfo.getName());
        return "Build ID: " + buildInfo.getId() + ", Version: " + buildInfo.getVersion() + ", Name: " + buildInfo.getName();
    }
}
