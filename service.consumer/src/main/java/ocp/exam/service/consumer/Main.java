package ocp.exam.service.consumer;

import ocp.exam.service.api.WebCrawler;
import ocp.exam.service.locator.WebCrawlerLocator;

public class Main {
    public static void main(String[] args) {
        var locator = new WebCrawlerLocator();
        WebCrawler webCrawler = locator.locate();
        System.out.println("web crawler is: " + webCrawler);
        System.out.println("remaining: " + webCrawler.remainingSitesToCrawl());
        System.out.println("task result" + webCrawler.getTaskResult(-1));
    }
}
