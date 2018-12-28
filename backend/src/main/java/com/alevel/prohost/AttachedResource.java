package com.alevel.prohost;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class AttachedResource {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "url")
    private String url;

    public AttachedResource() {

    }

    public AttachedResource(String url) {
        this.url = url;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AttachedResource that = (AttachedResource) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(url, that.url);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, url);
    }

    @Override
    public String toString() {
        return "AttachedResource{" +
                "id=" + id +
                ", url='" + url + '\'' +
                '}';
    }
}