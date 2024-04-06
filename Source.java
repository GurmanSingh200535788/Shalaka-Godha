package com.example.newsfinder;
// Source.java
/**
 * Represents the source of an article returned by the News API.
 */
public class Source {
    private String id;
    private String name;

    /**
     * Returns the unique identifier of the source.
     *
     * @return The unique identifier of the source.
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the unique identifier of the source.
     *
     * @param id The unique identifier of the source.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Returns the name of the source.
     *
     * @return The name of the source.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the source.
     *
     * @param name The name of the source.
     */
    public void setName(String name) {
        this.name = name;
    }
}