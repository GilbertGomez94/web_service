package com.api.adminvas.business;

import com.api.adminvas.Constants;
import com.api.adminvas.dao.UserDao;
import com.api.adminvas.domain.User;
import com.api.adminvas.dto.UserDto;

public class Session {

    private User _user;
    private UserDao dao = new UserDao();
    private UserDto dto = new UserDto();

    public UserDto loginUser(User user){
        _user = new User();
        try{
            if (user.getRole().equals(Constants.PROVIDER))
                _user =  dao.getUser( user );
            /*else{
            //camunda
        |   }*/
            
            dto.setUser(_user);
            dto.setMessage(Constants.FOUND);
        } catch (Exception e) {
            dto.setMessage(Constants.NOT_FOUND);
        }
        return dto;

    }
}
