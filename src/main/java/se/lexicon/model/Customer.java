package se.lexicon.model;

public class Customer {
  private String firstName;
  private String lastName;
  private String phoneNumber;
  private String email;

  public Customer(String firstName, String lastName, String phoneNumber, String email) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.phoneNumber = phoneNumber;
    this.email = email;
  }

  public String getCustomerSummary(){
    return "CustomerName: " + firstName + " " + lastName + "phoneNumber:" + phoneNumber + "email: " + email;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

}
