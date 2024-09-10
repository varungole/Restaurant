package org.example.Users;

public class User {

    private String userName;
    private String genderCode;
    private String phoneNumber;
    private String pinCode;

    public User(String userName, String genderCode, String phoneNumber, String pinCode) {
        this.userName = userName;
        this.genderCode = genderCode;
        this.phoneNumber = phoneNumber;
        this.pinCode = pinCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getGenderCode() {
        return genderCode;
    }

    public void setGenderCode(String genderCode) {
        this.genderCode = genderCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }
}
