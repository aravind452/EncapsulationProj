import models.*;

import java.util.*;

class Main {

  static AadhaarEntity aadhaar1 = new AadhaarEntity("Tabrez", 123, "Banglore", 321);
  static AadhaarEntity aadhaar2 = new AadhaarEntity("Shambu", 456, "Hubli", 654);
  static AadhaarEntity aadhaar3 = new AadhaarEntity("Shekhar", 789, "Chennai", 987);
  static AadhaarEntity aadhaar4 = new AadhaarEntity("Harsha", 486, "Delhi", 684);

  static List<AadhaarEntity> listOfUsers = new ArrayList<>(Arrays.asList(aadhaar1, aadhaar2, aadhaar3, aadhaar4));

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    boolean infoFlag = true;

    do {
      System.out.println("Aadhaar Portal!!!!!!!!!!!!");
      System.out.println("1. Get Info");
      System.out.println("2. Set Info");
      System.out.println("3. Exit");

      System.out.println("Choose the value.......");

      int userEnteredValue = sc.nextInt();

      switch (userEnteredValue) {

        case 1:
          getInfo();
          break;
        case 2:
          setInfo();
          break;
        case 3:
          infoFlag = false;
          break;

      }

    } while (infoFlag);

  }

  // Get Information
  static void getInfo() {
    Scanner sc = new Scanner(System.in);
    boolean getFlag = true;
    do {

      System.out.println("Get Info Page !!!!!!");
      System.out.println("1. " + listOfUsers.get(0).getName() + " Sir");
      System.out.println("2. " + listOfUsers.get(1).getName() + " Sir");
      System.out.println("3. " + listOfUsers.get(2).getName() + " Sir");
      System.out.println("4. " + listOfUsers.get(3).getName() + " Sir");
      System.out.println("5. Back To Main Menu.......");

      System.out.println("Enter the value !!!!");

      int userChoosenValue = sc.nextInt();

      if (userChoosenValue >= 1 && userChoosenValue <= 4) {
        AadhaarEntity user = listOfUsers.get(userChoosenValue - 1);
        showInfoOptions(user);

      } else if (userChoosenValue == 5) {
        getFlag = false;
        System.out.println("Ridirecting To Main Menu.....");

      } else {
        System.out.println("Invalid Option!!!!");
      }

    } while (getFlag);
  }

  // Get Specific Information
  static void showInfoOptions(AadhaarEntity user) {
    Scanner sc = new Scanner(System.in);
    boolean showFlag = true;

    do {
      System.out.println("Choose what information to display:");
      System.out.println("1. Name");
      System.out.println("2. Contact");
      System.out.println("3. Address");
      System.out.println("4. Aadhaar Number");
      System.out.println("5. All Details");
      System.out.println("6. Back");

      int choice = sc.nextInt();

      switch (choice) {
        case 1:
          System.out.println("Name: " + user.getName());
          break;
        case 2:
          System.out.println("Contact: " + user.getContact());
          break;
        case 3:
          System.out.println("Address: " + user.getAddress());
          break;
        case 4:
          System.out.println("Aadhaar Number: " + user.getAadhaarNo());
          break;
        case 5:
          displayUserInfo(user);
          break;
        case 6:
          showFlag = false;
          break;
        default:
          System.out.println("Invalid option, please choose again.");
      }

    } while (showFlag);
  }

  // Display All Info
  static void displayUserInfo(AadhaarEntity user) {
    System.out.println("Name: " + user.getName());
    System.out.println("Aadhaar Number: " + user.getAadhaarNo());
    System.out.println("Address: " + user.getAddress());
    System.out.println("Phone Number: " + user.getContact());
  }

  // Set Info
  static void setInfo() {
    Scanner sc = new Scanner(System.in);
    boolean setFlag = true;
    do {

      System.out.println("Set Info Page !!!!!!");
      System.out.println("1. " + listOfUsers.get(0).getName() + " Sir");
      System.out.println("2. " + listOfUsers.get(1).getName() + " Sir");
      System.out.println("3. " + listOfUsers.get(2).getName() + " Sir");
      System.out.println("4. " + listOfUsers.get(3).getName() + " Sir");
      System.out.println("5. Back To Main Menu");

      System.out.println("Enter the value !!!!");

      int userChoosenValue = sc.nextInt();

      switch (userChoosenValue) {
        case 1:
          updateUserInfo(listOfUsers.get(0), sc);
          break;
        case 2:
          updateUserInfo(listOfUsers.get(1), sc);
          break;
        case 3:
          updateUserInfo(listOfUsers.get(2), sc);
          break;
        case 4:
          updateUserInfo(listOfUsers.get(3), sc);
          break;
        case 5:
          setFlag = false;
          System.out.println("Ridirecting to Main Page");
          try {
            Thread.sleep(3000);
          } catch (InterruptedException e) {

            System.out.println("Error occured " + e.getMessage());
          }
          break;
        default:
          setFlag = false;
          System.out.println("Ridirecting to Main Page");
          try {
            Thread.sleep(3000);
          } catch (InterruptedException e) {

            System.out.println("Error occured " + e.getMessage());
          }
      }

    } while (setFlag);
  }

  static void updateUserInfo(AadhaarEntity user, Scanner sc) {

    boolean updateFlag = true;

    do {

      System.out.println("Update Options for " + user.getName() + ":");
      System.out.println("1. Update Name");
      System.out.println("2. Update Contact");
      System.out.println("3. Update Address");
      System.out.println("4. Back To Previous Menu");

      System.out.println("Choose the field you want to update");

      int updateChoice = sc.nextInt();
      switch (updateChoice) {
        case 1:
          System.out.println("Enter New Name");
          String newName = sc.next();
          user.setName(newName);

          break;
        case 2:
          System.out.println("Enter New Contact Number");
          int newNumber = sc.nextInt();
          user.setContact(newNumber);

          break;
        case 3:
          System.out.println("Enter New Address");
          String newAddress = sc.nextLine();
          user.setAddress(newAddress);

          break;
        case 4:
          updateFlag = false;
          System.out.println("Returning To Main Menu.....");
          try {
            Thread.sleep(3000);
          } catch (InterruptedException e) {

            System.out.println("Error occured " + e.getMessage());
          }
          break;
        default:
          System.out.println("Returning To Main Menu.....");
          try {
            Thread.sleep(3000);
          } catch (InterruptedException e) {

            System.out.println("Error occured " + e.getMessage());
          }
      }

    } while (updateFlag);

  }
}