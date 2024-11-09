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
    }

  }

  public int getContact() {
    return contact;
  }

  public void setContact(int contact) {
    if (verification()) {
      this.contact = contact;
    }

  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    if (verification()) {
      this.address = address;

    }

  }

  public int getAadhaarNo() {
    return aadhaarNo;
  }

  public boolean verification() {

    int registeredContact = sc.nextInt();
    if (contact == registeredContact) {
      System.out.println("Login successful");

      int generatedOtp = (int) Math.random() * 9999 + 9999;

      System.out.print("OTP is");

      try {
        Thread.sleep(3000);
      } catch (InterruptedException e) {

        System.out.println(e.getMessage());
      }

      System.out.println(generatedOtp);
      System.out.print("Enter the OTP");
      int enteredOtpByUser = sc.nextInt();
      System.out.println(enteredOtpByUser);
      if (generatedOtp == enteredOtpByUser) {
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
