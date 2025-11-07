package Stream;

public class User {

    private UserRole role;
    private String username;
    private Long id;
    private String email;
    private boolean active;

    public User(String email, Long id, String username, UserRole role, boolean active) {
        this.email = email;
        this.id = id;
        this.username = username;
        this.role = role;
        this.active = active;
    }

    public String getEmail() {return email;}
    public Long getId() {return id;}
    public String getUsername() {return username;}
    public UserRole getRole() {return role;}
    public boolean isActive() {return active;}
}
