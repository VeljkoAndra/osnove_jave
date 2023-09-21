package p14_09_2023;

import java.util.PrimitiveIterator;

public class InstagramUser {
        private String username;
        private String fullName;
        private String email;

        public InstagramUser (String username, String fullName, String email){
            this.username=username;
            this.fullName=username;
            this.email=email;
        }
    public void stampajUsera(){
        System.out.println(username);
    }
    public String getUsername() {
        return username;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }
}
