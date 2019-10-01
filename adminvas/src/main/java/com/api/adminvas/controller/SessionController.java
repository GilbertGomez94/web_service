package com.api.adminvas.controller;

import com.api.adminvas.business.Session;
import com.api.adminvas.domain.User;
import com.api.adminvas.dto.UserDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("session")
public class SessionController {

    private Session session = new Session();
    private UserDto dto = new UserDto();

    @GetMapping(value = "init_session/{username}/{password}/{role}",
            produces = {
                    MediaType.APPLICATION_JSON_VALUE
            })
    public ResponseEntity<UserDto> initSession(@PathVariable String username,
                                               @PathVariable String password,
                                               @PathVariable String role){
        User provider = new User();
        provider.setUsername(username);
        provider.setPassword(password);
        provider.setRole(role);
        return new ResponseEntity(session.loginUser(provider), HttpStatus.resolve(200));
    }


}
