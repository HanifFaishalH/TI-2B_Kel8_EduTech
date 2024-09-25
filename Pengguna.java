public class Pengguna {
    private String email;
    private String userId;

    public void setID(String id) {
        this.userId = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getUserID() {
        return userId;
    }

    public void printData() {
        System.out.println();
        System.out.println("ID : "+userId);
        System.out.println("Email : "+email);
    }
}
