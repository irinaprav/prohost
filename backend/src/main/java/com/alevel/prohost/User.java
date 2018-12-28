package com.alevel.prohost;


import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fullname")
    private String fullname;

    @Column(name = "nickname")
    private String nickname;

    @Column(name = "email")
    private String email;

    @Column(name = "rating")
    private Double rating;

    @OneToOne
    private AttachedResource photo;

    @Column(name = "phone")
    private String phone;

    @Column(name = "birthday")
    private Date birthday;

    @Column(name = "description")
    private String description;

    @Column(name = "offers")
    @OneToMany
    private List<Location> offers;

    @Column(name = "status")
    private Boolean status;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public AttachedResource getPhoto() {
        return photo;
    }

    public void setPhoto(AttachedResource photo) {
        this.photo = photo;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Location> getOffers() {
        return offers;
    }

    public void setOffers(List<Location> offers) {
        this.offers = offers;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(fullname, user.fullname) &&
                Objects.equals(nickname, user.nickname) &&
                Objects.equals(email, user.email) &&
                Objects.equals(rating, user.rating) &&
                Objects.equals(photo, user.photo) &&
                Objects.equals(phone, user.phone) &&
                Objects.equals(birthday, user.birthday) &&
                Objects.equals(description, user.description) &&
                Objects.equals(offers, user.offers) &&
                Objects.equals(status, user.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fullname, nickname, email, rating, photo, phone, birthday, description, offers, status);
    }

    public User(String fullname, String nickname, String email, Double rating, AttachedResource photo, String phone, Date birthday, String description, List<Location> offers, Boolean status) {
        this.fullname = fullname;
        this.nickname = nickname;
        this.email = email;
        this.rating = rating;
        this.photo = photo;
        this.phone = phone;
        this.birthday = birthday;
        this.description = description;
        this.offers = offers;
        this.status = status;
    }
}
