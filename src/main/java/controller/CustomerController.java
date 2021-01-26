package controller;

import model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CustomerController {
    @RequestMapping("/test-thymeleaf")
    public  String test(Model model){
        List<Customer> customers=new ArrayList<>();
        customers.add(new Customer(0,"Anh Dung","HN",0));
        customers.add(new Customer(1,"anh the","Hn",1));
        customers.add(new Customer(2,"anh phong","Hp",2));
        model.addAttribute("customers",customers);
        return "/Thymeleaft";
    }
}
