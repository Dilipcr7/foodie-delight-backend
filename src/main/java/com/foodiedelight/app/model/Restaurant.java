package com.foodiedelight.app.model;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    private String cuisine;
    private String description;
    private String phoneNumber;
    private String email;
    private String website;
    private boolean isOpen;
    private Integer rating;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCuisine() {
		return cuisine;
	}
	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public boolean isOpen() {
		return isOpen;
	}
	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	@Override
	public int hashCode() {
		return Objects.hash(address, cuisine, description, email, id, isOpen, name, phoneNumber, rating, website);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Restaurant other = (Restaurant) obj;
		return Objects.equals(address, other.address) && Objects.equals(cuisine, other.cuisine)
				&& Objects.equals(description, other.description) && Objects.equals(email, other.email)
				&& Objects.equals(id, other.id) && isOpen == other.isOpen && Objects.equals(name, other.name)
				&& Objects.equals(phoneNumber, other.phoneNumber) && Objects.equals(rating, other.rating)
				&& Objects.equals(website, other.website);
	}
	@Override
	public String toString() {
		return "Restaurant [id=" + id + ", name=" + name + ", address=" + address + ", cuisine=" + cuisine
				+ ", description=" + description + ", phoneNumber=" + phoneNumber + ", email=" + email + ", website="
				+ website + ", isOpen=" + isOpen + ", rating=" + rating + "]";
	}
	public Restaurant(Long id, String name, String address, String cuisine, String description, String phoneNumber,
			String email, String website, boolean isOpen, Integer rating) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.cuisine = cuisine;
		this.description = description;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.website = website;
		this.isOpen = isOpen;
		this.rating = rating;
	}
	
	public Restaurant() {
    }


    
}
