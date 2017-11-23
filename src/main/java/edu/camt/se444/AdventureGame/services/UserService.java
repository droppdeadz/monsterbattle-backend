package edu.camt.se444.AdventureGame.services;

import org.springframework.stereotype.Service;
import edu.camt.se444.AdventureGame.model.User;
import java.util.ArrayList;

@Service
public class UserService {
	ArrayList<User> users = new ArrayList<User>();
	private int count = 1;
    public ArrayList<User> getAllUsers() { return users; }
    
    public String register(User user) {
        Boolean isUsernameDuplicate = false;
        for (User each : users) {
            if (user.getUser().toLowerCase().equals(each.getUser().toLowerCase())) {
                isUsernameDuplicate = true;
            }
        }
        if (!isUsernameDuplicate) {
            User newUser = new User();
            newUser.setId(count);
            newUser.setUser(user.getUser());
            newUser.setPassword(user.getPassword());
            newUser.setFirstname(user.getFirstname());
            newUser.setLastname(user.getLastname());
            newUser.setEmail(user.getEmail());
            count++;
            users.add(newUser);
            return "{\"success\":1}";	
        } else {
            return "{\"success\":0,\n" +
                    "\"message\":\"This username can not be register\"}";
        }
    }
    public String login(User user) {
        String result = "{\"success\":0}";
        for (User each : users) {
            if (user.getUser().equals(each.getUser())) {
                if (user.getPassword().equals(each.getPassword())) {
                    result = "{\"success\":1,\n" +
                            "\"id\":" + each.getId() + "}";
                }
            }
        }
        return result;
    }
}
