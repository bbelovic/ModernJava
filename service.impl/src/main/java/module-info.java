import ocp.exam.service.api.WebCrawler;
import ocp.exam.service.impl.WebCrawlerImpl;

module service.impl {
    requires service.api;
    requires lal;
    provides WebCrawler with WebCrawlerImpl;
}