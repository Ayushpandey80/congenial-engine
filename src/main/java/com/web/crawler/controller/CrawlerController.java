package com.web.crawler.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/crawler")
public class CrawlerController {

    @RequestMapping(method = RequestMethod.GET, value = "/{url}")
    public void crawlURL(@RequestParam(name = "url") String url) {

    }
}
