package ru.mtusi.sampleapi.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.mtusi.sampleapi.dto.Status;

import java.net.InetAddress;
import java.net.UnknownHostException;
@Slf4j
@RestController
@RequestMapping(value="/api/v1/status", produces = MediaType.APPLICATION_JSON_VALUE)
public class StatusController {
    @GetMapping
    public Status get() throws UnknownHostException{
        Status info = new Status(InetAddress.getLocalHost().getHostName());
        log.info("Get status for" + info);
        return info;
    }

}
