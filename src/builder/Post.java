package builder;

public class Post {
    private final String title;

    @Override
    public String toString() {
        return "Post{" +
                "title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", category='" + category + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    private final String text;
    private final String category;
    private final String description;

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    Post(Builder builder) {
        this.title = builder.title;
        this.text = builder.text;
        this.category = builder.category;
        this.description = builder.description;
    }

    public static class Builder{
        private String title;
        private String text;
        private String category;
        private String description;

        public Builder title(String title) {
            this.title = title;
            return this;
        }
        public Builder text(String text) {
            this.text = text;
            return this;
        }
        public Builder category(String category) {
            this.category = category;
            return this;
        }
        public Builder description(String description) {
            this.description = description;
            return this;
        }
       public Post build(){
            return new Post(this);
       }

    }
}
