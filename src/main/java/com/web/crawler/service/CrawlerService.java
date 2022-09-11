package com.web.crawler.service;

import java.util.Map;

public interface CrawlerService {
    public Map<String, String> crawl(String url, int depth);
}
