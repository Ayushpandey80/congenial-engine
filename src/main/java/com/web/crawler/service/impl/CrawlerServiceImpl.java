package com.web.crawler.service.impl;

import com.web.crawler.service.CrawlerService;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

@Service
public class CrawlerServiceImpl implements CrawlerService {
    private static Logger logger = LoggerFactory.getLogger(CrawlerServiceImpl.class);

    private static final int MAX_DEPTH = 2;

    private List<String> url;

    private List<String> visitedUrl;
    @Override
    public Map<String, String> crawl(String url, String keyword) {
        getUrl().add(url);

        for (String link : getUrl()){
            visitedUrl.add(link);
        }
        return null;
    }

    public List<String> getUrl() {
        return url;
    }

    public void setUrl(List<String> url) {
        this.url = url;
    }

    public List<String> getVisitedUrl() {
        return visitedUrl;
    }

    public void setVisitedUrl(List<String> visitedUrl) {
        this.visitedUrl = visitedUrl;
    }
}
