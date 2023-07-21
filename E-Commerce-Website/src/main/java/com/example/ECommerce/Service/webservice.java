package com.example.ECommerce.Service;

import java.util.List;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ECommerce.Model.webuser;
import com.example.ECommerce.Repository.webrepo;

@Service
public class webservice {
    @Autowired
    webrepo repo;

    public void Add(webuser use) {
        repo.save(use);
    }

   


    public List<webuser> show() {
        return repo.findAll();
    }

    // public List<webuser> show() {
    //     return repo.findAll();
    // }

    
}
