package com.sp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.sp.service.serviceCard;
import com.sp.model.Cart;

@RestController
public class TestRestCrt {
    @Autowired
    serviceCard serviceC;    
    
    @RequestMapping(method=RequestMethod.POST,value="/card")
    public void addCard(@RequestBody Cart c) {
    	serviceC.addCart(c);
    }
    
    @RequestMapping(method=RequestMethod.GET,value="/card/{id}")
    public Cart getCard(@PathVariable String id) {
    	Cart c=serviceC.getCart(Integer.valueOf(id));
        return c;
    }
}

