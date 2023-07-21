package com.example.ECommerce.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "userdetails")
public class webuser {
     
    @Id
    private String email;

    private String fname;
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

  

    @Override
    public String toString() {
        return "Demo [email=" + email + ", fname=" + fname + ", password=" + password + "]";
    }
}


// package com.example.ECommerce.Model;

// import jakarta.persistence.Column;
// import jakarta.persistence.Entity;

// import jakarta.persistence.Id;
// import jakarta.persistence.Table;

// @Entity
// @Table(name="login")  // shop is database table name
// public class webuser {
    
//     @Id
//     @Column(nullable = false,unique = true)
//     private String Username;
    
//     private String Password;
    
//     public String getUsername() {
//         return Username;
//     }
//     public void setUsername(String username) {
//         Username = username;
//     }
//     public String getPassword() {
//         return Password;
//     }
//     public void setPassword(String password) {
//         Password = password;
//     }
    
//     @Override
//     public String toString() {
//         return "webuser [Username=" + Username + ", Password=" + Password + "]";
//     }

    
    
// }
