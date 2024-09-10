package org.example.Utilities;

public class Pair {

    public Integer rating;
    public String comment;

    public Pair(Integer rating, String comment) {
        this.rating = rating;
        this.comment = comment;
    }

    public Integer getRating() {
        return this.rating;
    }

    public String getComment() {
        return this.comment;
    }
}
