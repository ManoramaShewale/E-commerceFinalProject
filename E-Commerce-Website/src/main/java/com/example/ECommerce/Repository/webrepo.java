package com.example.ECommerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.ECommerce.Model.webuser;


public interface webrepo extends JpaRepository<webuser, String>{

   
    
}