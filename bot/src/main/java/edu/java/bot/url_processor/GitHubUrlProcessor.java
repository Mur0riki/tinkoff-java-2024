package edu.java.bot.url_processor;

public class GitHubUrlProcessor extends UrlProcessor {
    public GitHubUrlProcessor(UrlProcessor processor) {
        super(processor);
    }

    @Override
    protected String getValidHostName() {
        return "github.com";
    }
}
