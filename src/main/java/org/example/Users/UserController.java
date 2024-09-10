package org.example.Users;

public interface UserController {

    void registerUser(String userName, String genderCode, String phoneNumber, String pincode);
    void loginUser(String username);
    void logoutUser(String username);
    User getCurrentUser();
}
