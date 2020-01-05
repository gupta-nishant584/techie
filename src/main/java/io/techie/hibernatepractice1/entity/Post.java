package io.techie.hibernatepractice1.entity;


import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="POST")
public class Post {

    @Id
    @GeneratedValue
    private long id;

    @Column(name="TITLE")
    private String title;

    @Column(name="DESCRIPTION")
    private String description;

    @Column(name="CONTENT")
    private String content;

    @Column(name="POSTED_AT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date postedAt = new Date();

    @Column(name="LAST_UPDATED_AT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdatedAt = new Date();

    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinTable(joinColumns = {@JoinColumn(name="POST_ID")}, inverseJoinColumns = {@JoinColumn(name="TAG_ID")})
    private Set<Tag> tags =  new HashSet<>();

    public Post(){

    }

    public Post(String title, String description, String content) {
        this.title = title;
        this.description = description;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getPostedAt() {
        return postedAt;
    }

    public void setPostedAt(Date postedAt) {
        this.postedAt = postedAt;
    }

    public Date getLastUpdatedAt() {
        return lastUpdatedAt;
    }

    public void setLastUpdatedAt(Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    public Set<Tag> getTags() {
        return tags;
    }

    public void setTags(Set<Tag> tags) {
        this.tags = tags;
    }
}
