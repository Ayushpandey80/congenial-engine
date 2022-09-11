package com.web.crawler.controller;

import com.web.crawler.service.CrawlerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/crawler")
@RestController
public class CrawlerController {

    private static Logger logger = LoggerFactory.getLogger(CrawlerController.class);

    @Autowired
    private CrawlerService crawlerService;

    @RequestMapping(method = RequestMethod.GET, value = "/crawl")
    public void crawlURL(@RequestParam(name = "url") final String url) {
        logger.info("URL : "+url);
        crawlerService.crawl(url, 0);
    }
}
