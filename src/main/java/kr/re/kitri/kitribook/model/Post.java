package kr.re.kitri.kitribook.model;

public class Post {
    private long postId;
    private String author;
    private String title;
    private String content;
    private long likes;

    public Post() {}

    public Post(long postId, String author, String title, String content, long likes) {
        this.postId = postId;
        this.author = author;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public long getPostId() {
        return postId;
    }

    public void setPostId(long postId) {
        this.postId = postId;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public long getLikes() {
        return likes;
    }
    public void setLikes(long likes) {
        this.likes = likes;
    }

    @Override
    public String toString() {
        return "Post{" +
                "postId='" + postId + '\'' +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", likes=" + likes +
                '}';
    }
}
