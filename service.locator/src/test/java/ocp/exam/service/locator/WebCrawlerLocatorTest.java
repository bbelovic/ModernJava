package ocp.exam.service.locator;

import ocp.exam.service.api.WebCrawler;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WebCrawlerLocatorTest {
    @Test public void testLoadAllWebCrawlerImplementations() {
        WebCrawlerLocator webCrawlerLocator = new WebCrawlerLocator();
        WebCrawler webCrawler = webCrawlerLocator.locate();
        assertNull(webCrawler);
    }

}