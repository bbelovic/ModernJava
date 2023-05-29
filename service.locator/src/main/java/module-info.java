import ocp.exam.service.api.WebCrawler;

module service.locator {
    exports ocp.exam.service.locator;
    requires transitive service.api;
    uses WebCrawler;
}