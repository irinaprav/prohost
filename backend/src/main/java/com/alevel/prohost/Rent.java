package com.alevel.prohost;


import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
public class Rent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @Column(name = "tenant")
    private User tenant;

    @OneToOne
    @Column(name = "location")
    private Location location;

    @Column(name = "startDay")
    private Date startDay;

    @Column(name = "endDay")
    private Date endDay;

    @Column(name = "rating")
    private Double rating;

    @Column(name = "comment")
    private String comment;

    @Column(name = "expDay")
    private Date expDay;

    @Column(name = "agreement")
    private Boolean agreement;

    public Rent() {
    }

    public Rent(User tenant, Location location, Date startDay, Date endDay, Double rating, String comment, Date expDay, Boolean agreement) {
        this.tenant = tenant;
        this.location = location;
        this.startDay = startDay;
        this.endDay = endDay;
        this.rating = rating;
        this.comment = comment;
        this.expDay = expDay;
        this.agreement = agreement;
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

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Date getStartDay() {
        return startDay;
    }

    public void setStartDay(Date startDay) {
        this.startDay = startDay;
    }

    public Date getEndDay() {
        return endDay;
    }

    public void setEndDay(Date endDay) {
        this.endDay = endDay;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getExpDay() {
        return expDay;
    }

    public void setExpDay(Date expDay) {
        this.expDay = expDay;
    }

    public Boolean getAgreement() {
        return agreement;
    }

    public void setAgreement(Boolean agreement) {
        this.agreement = agreement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rent rent = (Rent) o;
        return Objects.equals(id, rent.id) &&
                Objects.equals(tenant, rent.tenant) &&
                Objects.equals(location, rent.location) &&
                Objects.equals(startDay, rent.startDay) &&
                Objects.equals(endDay, rent.endDay) &&
                Objects.equals(rating, rent.rating) &&
                Objects.equals(comment, rent.comment) &&
                Objects.equals(expDay, rent.expDay) &&
                Objects.equals(agreement, rent.agreement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tenant, location, startDay, endDay, rating, comment, expDay, agreement);
    }
}
