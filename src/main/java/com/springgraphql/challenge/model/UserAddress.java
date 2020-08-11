package com.springgraphql.challenge.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserAddress {
	
	private String street;
	private String suite;
	private String city;
	private String zipcode;
	
	public UserAddress() {
		super();
	}
	
	public UserAddress(String street, String suite, String city, String zipcode) {
		this.street = street;
		this.suite = suite;
		this.city = city;
		this.zipcode = zipcode;
	}
	@Override
	public String toString() {
		return "UserAddress [street=" + street + ", suite=" + suite + ", city=" + city + ", zipcode=" + zipcode + "]";
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getSuite() {
		return suite;
	}
	public void setSuite(String suite) {
		this.suite = suite;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

}
