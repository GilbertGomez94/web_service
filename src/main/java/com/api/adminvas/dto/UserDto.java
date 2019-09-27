package com.api.adminvas.dto;

import com.api.adminvas.domain.User;

public class UserDto extends Dto{
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
