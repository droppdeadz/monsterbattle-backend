package edu.camt.se444;

import java.util.ArrayList;

import edu.camt.se444.AdventureGame.model.User;
import edu.camt.se444.AdventureGame.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserController {
	@Autowired
    private UserService userService;

    @RequestMapping(value = "/user", method = RequestMethod.GET, produces = "application/json")
    public ArrayList<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @RequestMapping(value = "/user/registration", method = RequestMethod.POST, produces = "application/json")
    public String register(@RequestBody User User) {
        return userService.register(User);
    }

    @RequestMapping(value = "/user/login", method = RequestMethod.POST, produces = "application/json")
    public String login(@RequestBody User user) {
        return userService.login(user);
    }

}
//{
//        "id": 1,
//        "user": "droppdeadz",
//        "password": "asdasdasd1",
//        "firstname": "dolawat",
//        "lastname": "wannapira",
//        "email": "dolawat@cmu.ac.th"
//        }

