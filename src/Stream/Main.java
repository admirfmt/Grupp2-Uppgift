package Stream;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        UserService userService = new UserService();
        List<UserDTO> mainResult = userService.getActiveAdminUsers(users);
        System.out.println(mainResult);

    }
}
