package com.auto.yavat.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * A Vehicle.
 */
@Entity
@Table(name = "vehicle")
public class Vehicle implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "car")
    private String car;

    @Column(name = "brand")
    private String brand;

    @Column(name = "model")
    private String model;

    @Column(name = "year")
    private Integer year;

    @Column(name = "color")
    private String color;

    @Column(name = "jhi_condition")
    private String condition;

    @Column(name = "minor_issues")
    private String minorIssues;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "zipcode")
    private Integer zipcode;

    @Column(name = "owner_id")
    private Integer ownerId;

    // jhipster-needle-entity-add-field - JHipster will add fields here
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Vehicle id(Long id) {
        this.id = id;
        return this;
    }

    public String getCar() {
        return this.car;
    }

    public Vehicle car(String car) {
        this.car = car;
        return this;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String getBrand() {
        return this.brand;
    }

    public Vehicle brand(String brand) {
        this.brand = brand;
        return this;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return this.model;
    }

    public Vehicle model(String model) {
        this.model = model;
        return this;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return this.year;
    }

    public Vehicle year(Integer year) {
        this.year = year;
        return this;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getColor() {
        return this.color;
    }

    public Vehicle color(String color) {
        this.color = color;
        return this;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCondition() {
        return this.condition;
    }

    public Vehicle condition(String condition) {
        this.condition = condition;
        return this;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getMinorIssues() {
        return this.minorIssues;
    }

    public Vehicle minorIssues(String minorIssues) {
        this.minorIssues = minorIssues;
        return this;
    }

    public void setMinorIssues(String minorIssues) {
        this.minorIssues = minorIssues;
    }

    public String getCity() {
        return this.city;
    }

    public Vehicle city(String city) {
        this.city = city;
        return this;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return this.state;
    }

    public Vehicle state(String state) {
        this.state = state;
        return this;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getZipcode() {
        return this.zipcode;
    }

    public Vehicle zipcode(Integer zipcode) {
        this.zipcode = zipcode;
        return this;
    }

    public void setZipcode(Integer zipcode) {
        this.zipcode = zipcode;
    }

    public Integer getOwnerId() {
        return this.ownerId;
    }

    public Vehicle ownerId(Integer ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Vehicle)) {
            return false;
        }
        return id != null && id.equals(((Vehicle) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Vehicle{" +
            "id=" + getId() +
            ", car='" + getCar() + "'" +
            ", brand='" + getBrand() + "'" +
            ", model='" + getModel() + "'" +
            ", year=" + getYear() +
            ", color='" + getColor() + "'" +
            ", condition='" + getCondition() + "'" +
            ", minorIssues='" + getMinorIssues() + "'" +
            ", city='" + getCity() + "'" +
            ", state='" + getState() + "'" +
            ", zipcode=" + getZipcode() +
            ", ownerId=" + getOwnerId() +
            "}";
    }
}
