package net.javaguides.springboot.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

    @Entity
    @Table(name = "user")
    public class DAOUser {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;
        @Column
        private String username;
        @Column
        @JsonIgnore
        private String password;
        @Column
        private String email;

        public DAOUser() {
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

}
