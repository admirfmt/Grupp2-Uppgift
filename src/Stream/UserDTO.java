package Stream;

public class UserDTO {
    private String username;
    private Long id;
    private String email;


    public UserDTO(Long id, String username, String email) {

        this.username = username;
        this.id = id;
        this.email = email;
    }

    public String getEmail() {return email;}
    public Long getId() {return id;}
    public String getUsername() {return username;}

}