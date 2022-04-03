package ca.sait.lab8security.services;

import ca.sait.lab8security.dataaccess.UserDB;
import ca.sait.lab8security.models.User;

public class AccountService {
    
    public User login(String email, String password) {
        UserDB userDB = new UserDB();
        
        try {
            User user = userDB.get(email);
            if (password.equals(user.getPassword())) {
                return user;
            }
        } catch (Exception e) {
        }
        
        return null;
    }
}
