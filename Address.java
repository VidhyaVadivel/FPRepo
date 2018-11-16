
public class Address {
String street;
String lane;
String district;
String city;
String State;
String country;
int pincode;
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getLane() {
	return lane;
}
public void setLane(String lane) {
	this.lane = lane;
}
public String getDistrict() {
	return district;
}
public void setDistrict(String district) {
	this.district = district;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return State;
}
public void setState(String state) {
	State = state;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
@Override
public String toString() {
	return "Address [street=" + street + ", lane=" + lane + ", district=" + district + ", city=" + city + ", State="
			+ State + ", country=" + country + ", pincode=" + pincode + "]";
}



}
