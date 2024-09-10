package org.example.Users;

public class UserControllerImpl implements UserController {

    private final UserManagement userManagement;

    public UserControllerImpl(UserManagement userManagement) {
        this.userManagement = userManagement;
    }

    @Override
    public void registerUser(String userName, String genderCode, String phoneNumber, String pincode) {
        userManagement.registerUser(userName, genderCode, phoneNumber, pincode);
    }

    @Override
    public void loginUser(String username) {
        userManagement.loginUser(username);
    }

    @Override
    public void logoutUser(String username) {
        userManagement.logoutUser(username);
    }

    @Override
    public User getCurrentUser() {
        return userManagement.getCurrentUser();
    }
}
