package ocp.exam.service.locator;

import ocp.exam.service.api.WebCrawler;

import java.util.ServiceLoader;

public class WebCrawlerLocator {
    public WebCrawler locate() {
        for (var c: ServiceLoader.load(WebCrawler.class)) {
            return c;
        }
        return null;
    }
}
