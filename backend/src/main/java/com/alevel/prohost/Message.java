package com.alevel.prohost;


import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @Column(name = "tenant")
    private User tenant;

    @OneToOne
    @Column(name = "host")
    private User host;

    @OneToOne
    @Column(name = "location")
    private Location location;

    @Column(name = "message")
    private String message;

    @OneToMany
    @Column(name = "attachments")
    private List<AttachedResource> attachments;

    @Column(name = "isRead")
    private Boolean isRead;

    public Message() {

    }

    public Message(User tenant, User host, Location location, String message, List<AttachedResource> attachments, Boolean isRead) {
        this.tenant = tenant;
        this.host = host;
        this.location = location;
        this.message = message;
        this.attachments = attachments;
        this.isRead = isRead;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getTenant() {
        return tenant;
    }

    public void setTenant(User tenant) {
        this.tenant = tenant;
    }

    public User getHost() {
        return host;
    }

    public void setHost(User host) {
        this.host = host;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<AttachedResource> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<AttachedResource> attachments) {
        this.attachments = attachments;
    }

    public Boolean getRead() {
        return isRead;
    }

    public void setRead(Boolean read) {
        isRead = read;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message1 = (Message) o;
        return Objects.equals(id, message1.id) &&
                Objects.equals(tenant, message1.tenant) &&
                Objects.equals(host, message1.host) &&
                Objects.equals(location, message1.location) &&
                Objects.equals(message, message1.message) &&
                Objects.equals(attachments, message1.attachments) &&
                Objects.equals(isRead, message1.isRead);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tenant, host, location, message, attachments, isRead);
    }
}
