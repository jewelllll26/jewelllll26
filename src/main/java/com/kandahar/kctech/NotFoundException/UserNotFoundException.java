package com.kandahar.kctech.NotFoundException;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException (Long id){
        super ("Could not found user with" + id);
    }

}
