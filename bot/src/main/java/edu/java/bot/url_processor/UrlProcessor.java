package edu.java.bot.url_processor;

import java.net.URI;

public abstract class UrlProcessor {
    protected UrlProcessor nextProcessor;

    public UrlProcessor(UrlProcessor processor) {
        this.nextProcessor = processor;
    }

    protected abstract String getValidHostName();

    public final boolean isValidUrl(URI url) {
        try {
            if (url.getHost().equals(getValidHostName())) {
                return true;
            }
            if (this.nextProcessor != null) {
                return this.nextProcessor.isValidUrl(url);
            }
        } catch (NullPointerException exception) {
            return false;
        }
        return false;
    }
}
