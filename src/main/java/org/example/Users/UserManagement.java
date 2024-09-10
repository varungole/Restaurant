package org.example.Users;

import org.example.ErrorHandling.Errors;

import java.util.HashMap;

public class UserManagement {

    public Errors errors;
    public HashMap<String, User> userMap;
    public User currentUser;

    public UserManagement(Errors errors, HashMap<String, User> userMap, User currentUser) {
        this.errors = errors;
        this.userMap = userMap;
        this.currentUser = currentUser;
    }

    public void registerUser(String userName, String genderCode, String phoneNumber, String pincode) {
        User newUser = new User(userName, genderCode, phoneNumber, pincode);
        if(errors.userAlreadyExists(userName)) {
            return;
        }
        userMap.put(userName, newUser);
        System.out.println("User " + userName + " is now registered");
    }

    public void loginUser(String username) {
        User u = userMap.get(username);
        if(errors.isUserValid(username)) {
            return;
        }
        currentUser = u;
        System.out.println("Current user is " + u.getUserName());
    }

    public void logoutUser(String username) {
        User u = userMap.get(username);
        if(errors.isUserValid(username)) {
            return;
        }
        currentUser = null;
        userMap.remove(username);
        System.out.println("Logged out successfully!");
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }
}
