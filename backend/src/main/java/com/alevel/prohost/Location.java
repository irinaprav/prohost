package com.alevel.prohost;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String country;

    private String region;

    private String address;

    private String city;

    private Type type;

    private Integer capacity;

    private Integer rating;

    private String description;

    @ManyToOne
    private User host;

    @ManyToMany
    private List<User> tenants;

    private PriceType priceType;

    private Long amount;

    private String currency;

    private List<AttachedResource> photos;

    private Boolean status;

    public Location() {
    }

    @Override
    public String toString() {
        return "Location{" +
                "id=" + id +
                ", country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", type=" + type +
                ", capacity=" + capacity +
                ", rating=" + rating +
                ", description='" + description + '\'' +
                ", host=" + host +
                ", tenants=" + tenants +
                ", priceType=" + priceType +
                ", amount=" + amount +
                ", currency='" + currency + '\'' +
                ", photos=" + photos +
                ", status=" + status +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return Objects.equals(id, location.id) &&
                Objects.equals(country, location.country) &&
                Objects.equals(region, location.region) &&
                Objects.equals(address, location.address) &&
                Objects.equals(city, location.city) &&
                type == location.type &&
                Objects.equals(capacity, location.capacity) &&
                Objects.equals(rating, location.rating) &&
                Objects.equals(description, location.description) &&
                Objects.equals(host, location.host) &&
                Objects.equals(tenants, location.tenants) &&
                priceType == location.priceType &&
                Objects.equals(amount, location.amount) &&
                Objects.equals(currency, location.currency) &&
                Objects.equals(photos, location.photos) &&
                Objects.equals(status, location.status);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, country, region, address, city, type, capacity, rating, description, host, tenants, priceType, amount, currency, photos, status);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getHost() {
        return host;
    }

    public void setHost(User host) {
        this.host = host;
    }

    public List<User> getTenants() {
        return tenants;
    }

    public void setTenants(List<User> tenants) {
        this.tenants = tenants;
    }

    public PriceType getPriceType() {
        return priceType;
    }

    public void setPriceType(PriceType priceType) {
        this.priceType = priceType;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public List<AttachedResource> getPhotos() {
        return photos;
    }

    public void setPhotos(List<AttachedResource> photos) {
        this.photos = photos;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Location(String country, String region, String address, String city, Type type, Integer capacity, Integer rating, String description, User host, List<User> tenants, PriceType priceType, Long amount, String currency, List<AttachedResource> photos, Boolean status) {
        this.country = country;
        this.region = region;
        this.address = address;
        this.city = city;
        this.type = type;
        this.capacity = capacity;
        this.rating = rating;
        this.description = description;
        this.host = host;
        this.tenants = tenants;
        this.priceType = priceType;
        this.amount = amount;
        this.currency = currency;
        this.photos = photos;
        this.status = status;
    }
}