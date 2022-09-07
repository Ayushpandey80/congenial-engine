package com.web.crawler.dto;

import java.util.HashSet;
import java.util.List;

public class ExtractedDTO {

    private HashSet<String> urlLinks;
    private List<String> articles;

    public HashSet<String> getUrlLinks() {
        return urlLinks;
    }

    public void setUrlLinks(HashSet<String> urlLinks) {
        this.urlLinks = urlLinks;
    }

    public List<String> getArticles() {
        return articles;
    }

    public void setArticles(List<String> articles) {
        this.articles = articles;
    }
}
