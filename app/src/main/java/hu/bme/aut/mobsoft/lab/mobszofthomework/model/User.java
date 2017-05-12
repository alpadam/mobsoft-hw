package hu.bme.aut.mobsoft.lab.mobszofthomework.model;


import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class User {

    @SerializedName("id")
    private Long id = null;

    @SerializedName("username")
    private String username = null;

    @SerializedName("password")
    private String password = null;



    /**
     * Unique user identifier.
     **/
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }


    /**
     * Username of the user.
     **/
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }


    /**
     * Password.
     **/
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return id.equals(user.id) &&
                username.equals(user.username) &&
                password.equals(user.password);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class User {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
