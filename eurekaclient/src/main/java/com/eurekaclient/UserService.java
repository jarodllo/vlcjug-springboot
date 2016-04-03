package com.eurekaclient;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {

    public static final String SERVICE_URL = "http://USER-SERVICE";

    @Autowired
    protected RestTemplate restTemplate;
    protected String serviceUrl;

    public UserService() {
        this.serviceUrl =  SERVICE_URL;
    }

    public User findUser(Long id) {
        User user = restTemplate.getForObject(serviceUrl + "/user/" + id, User.class, id);

        return user;
    }

    public List<User> findAll() {
        return restTemplate.getForObject(serviceUrl + "/user", List.class);

    }
}
