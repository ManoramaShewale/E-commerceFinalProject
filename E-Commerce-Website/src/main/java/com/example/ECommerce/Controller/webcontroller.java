package com.example.ECommerce.Controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.ECommerce.Model.webuser;
import com.example.ECommerce.Service.webservice;

//import ch.qos.logback.core.model.Model;

//import com.example.ECommerce.Service.webservice;

@Controller
public class webcontroller {
  @Autowired
  webservice web;

  @GetMapping("/hello")
  public String homepage() {
    return "index";
  }

  @GetMapping("/women")
  public String home() {
    return "Women";
  }

  @GetMapping("/")
  public String men() {
    return "Men";
  }

  @GetMapping("/bag")
  public String cart() {
    return "cart";
  }

  @GetMapping("/forget")
  public String forget() {
    return "forget";
  }

  // @GetMapping("/")
  // public String payment(){
  // return "payment";
  // }

  @GetMapping("/log")
  public String show() {
    return "signup";
  }

   @GetMapping("/acc")
  public String newacc() {
    return "createnewacc";
  }

  
                                   // Login page 

  // @PostMapping("/login")
  // public String wel(@ModelAttribute webuser user, Model model) {
  //   System.out.println(user);
    
  //   model.addAttribute("Username", user.getUsername());
  //   model.addAttribute("password", user.getPassword());
  //   web.Add(user);

  //   // model.addAttribute("data", web.show());
  //   return "welcome";

  // }


@GetMapping("/logout")
public String welcome() {
  return "welcome";
}




@PostMapping("/regstier")
public String addpg(@ModelAttribute webuser d, Model m) {
    System.out.println(d.toString());

    // m.addAttribute("name", d.getName());

    m.addAttribute("fname", d.getFname());
    m.addAttribute("email", d.getEmail());
    m.addAttribute("password", d.getPassword());

    web.Add(d);

    return "welcome";

}

// @PostMapping("/check")
// public String compare(@ModelAttribute webuser d, Model m) {

//     List<webuser> dl = web.show();

//     for (webuser d1 : dl) {
//         if (d1.getEmail().equals(d.getEmail()) && d1.getPassword().equals(d.getPassword())) {
//             return "signup";
//         }
//     }
//     return "index";
// }

// @PostMapping("/reset")
// public String update(@ModelAttribute webuser d, Model m) {
//     List<webuser> dl = web.show();
//     // m.addAttribute("data",ds.show());
//     for (webuser d1 : dl) {
//         if (d1.getEmail().equals(d.getEmail())) {
//             d1.setPassword(d.getPassword());
//             d1.setFname(d1.getFname());

//             web.Add(d1);
//             return "index";
//         }
//     }
//     return "forget";

// }
}
        
    
    
