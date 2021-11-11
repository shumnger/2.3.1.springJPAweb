package SpringHiberMVC.dao;

import SpringHiberMVC.model.User;
import SpringHiberMVC.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class UserInit {

    @Autowired
    private UserService userService;

    @PostConstruct
    public void userInit() {
        User user1 = new User();
        user1.setName("Ашот");
        user1.setLastName("Аветисян");
        user1.seteMail("ashot@mail");
        userService.addUser(user1);

        User user2 =new User();
        user2.setName("Иван");
        user2.setLastName("Иванов");
        user2.seteMail("ivan@mail");
        userService.addUser(user2);
    }
}
