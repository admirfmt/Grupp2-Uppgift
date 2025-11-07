package Stream;

import java.util.List;

public class UserService {

    public List<UserDTO> getActiveAdminUsers(List<User> users) {
        return users.stream()
                .filter(user -> user.isActive() && user.getRole() == UserRole.ADMIN)
                .map(this::convertToDTO)
                .toList();
    }
    private UserDTO convertToDTO(User user) {
        return new UserDTO(user.getId(), user.getUsername(), user.getEmail());
    }
}