package models;

import java.util.*;

public class AadhaarEntity {

  private String name;
  private int contact;
  private String address;
  private int aadhaarNo;
  static Scanner sc = new Scanner(System.in);

  public AadhaarEntity(String name, int contact, String address, int aadhaarNo) {
    this.name = name;
    this.contact = contact;
    this.address = address;
    this.aadhaarNo = aadhaarNo;
  }

  public AadhaarEntity() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    if (verification()) {
      this.name = name;
      System.out.println("Name Updated Successfully!");
    }

  }

  public int getContact() {
    return contact;
  }

  public void setContact(int contact) {
    if (verification()) {
      this.contact = contact;
      System.out.println("Contact Updated Successfully!");
    }

  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    if (verification()) {
      this.address = address;
      System.out.println("Address Updated Successfully!");

    }

  }

  public int getAadhaarNo() {
    return aadhaarNo;
  }

  public boolean verification() {

    int registeredContact = sc.nextInt();
    if (contact == registeredContact) {

      int generatedOtp = 100000 + (int) (Math.random() * 999999);

      System.out.print("OTP is ");

      try {
        Thread.sleep(3000);
      } catch (InterruptedException e) {

        System.out.println(e.getMessage());
      }

      System.out.println(generatedOtp);
      System.out.print("Enter the OTP ");
      int enteredOtpByUser = sc.nextInt();

      System.out.println(enteredOtpByUser);
      if (generatedOtp == enteredOtpByUser) {
        System.out.println("Login successful");
        return true;
      } else {
        System.out.println("Wrong OTP");
        return false;
      }

    }
    System.out.println("Invalid details! Login denied!");
    return false;

  }

}
