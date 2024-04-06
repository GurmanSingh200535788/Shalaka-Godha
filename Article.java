package com.example.newsfinder;
// Article.java
import com.google.gson.annotations.SerializedName;

/**
 * Represents an article object returned by the News API.
 */
public class Article {
    private Source source;
    private String author;
    private String title;
    private String description;
    private String url;
    @SerializedName("urlToImage")
    private String imageUrl;
    private String publishedAt;
    private String content;

    /**
     * Returns the source of the article.
     *
     * @return The source of the article.
     */
    public Source getSource() {
        return source;
    }

    /**
     * Sets the source of the article.
     *
     * @param source The source of the article.
     */
    public void setSource(Source source) {
        this.source = source;
    }

    /**
     * Returns the author of the article.
     *
     * @return The author of the article.
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the author of the article.
     *
     * @param author The author of the article.
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Returns the title of the article.
     *
     * @return The title of the article.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title of the article.
     *
     * @param title The title of the article.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Returns the description of the article.
     *
     * @return The description of the article.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description of the article.
     *
     * @param description The description of the article.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Returns the URL of the article.
     *
     * @return The URL of the article.
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the URL of the article.
     *
     * @param url The URL of the article.
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Returns the URL of the article's image.
     *
     * @return The URL of the article's image.
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * Sets the URL of the article's image.
     *
     * @param imageUrl The URL of the article's image.
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * Returns the published date of the article.
     *
     * @return The published date of the article.
     */
    public String getPublishedAt() {
        return publishedAt;
    }

    /**
     * Sets the published date of the article.
     *
     * @param publishedAt The published date of the article.
     */
    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    /**
     * Returns the content of the article.
     *
     * @return The content of the article.
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the content of the article.
     *
     * @param content The content of the article.
     */
    public void setContent(String content) {
        this.content = content;
    }
}

