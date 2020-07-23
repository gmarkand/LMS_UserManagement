package io.lms.usermanagementservice.services;

import io.lms.usermanagementservice.model.LMSUser;
import io.lms.usermanagementservice.usercrud.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService
{
    @Autowired
    private UserRepository userRepository;

    public void addUser(LMSUser user)
    {
        userRepository.save( user );
    }

    public List<LMSUser> getAllUsers()
    {
        List<LMSUser> usersList = new ArrayList<LMSUser>();
        userRepository.findAll().forEach( usersList::add);
        return usersList;
    }

    public void deleteUserById(long userId)
    {
        userRepository.deleteById(userId);
    }

    public Optional<LMSUser> getUserById(long userId)
    {
        return userRepository.findById( userId );
    }

    public void updateUser(long id, LMSUser user)
    {
        if(user.getId() == id)
        userRepository.save( user );

    }
}