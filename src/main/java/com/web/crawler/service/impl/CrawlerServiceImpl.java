package com.web.crawler.service.impl;

import com.web.crawler.service.CrawlerService;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.*;

@Service
public class CrawlerServiceImpl implements CrawlerService {
    private static Logger logger = LoggerFactory.getLogger(CrawlerServiceImpl.class);

    private static final int MAX_DEPTH = 2;

    private List<String> urls;

    private List<String> visitedUrl;

    @Override
    public Map<String, String> crawl(String url, int depth) {

        if (!(getUrls().contains(url)) && depth < MAX_DEPTH) {
            System.out.println(url);
            try {
                getUrls().add(url);
                Document document = Jsoup.connect(url).get();
                Elements ele = document.select("a[href]");
                depth++;
                for (Element page : ele) {
                    crawl(page.attr("abs:href"), depth);
                }
            } catch (Exception e){
                System.out.println(e);
            }
        }
        return null;
    }

    public List<String> getUrls() {
        if (CollectionUtils.isEmpty(urls)){
            return new ArrayList<>();
        }
        return urls;
    }

    public void setUrls(List<String> urls) {
        this.urls = urls;
    }

    public List<String> getVisitedUrl() {
        return visitedUrl;
    }

    public void setVisitedUrl(List<String> visitedUrl) {
        this.visitedUrl = visitedUrl;
    }
}
