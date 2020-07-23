package io.lms.usermanagementservice.controller;

import io.lms.usermanagementservice.model.LMSUser;
import io.lms.usermanagementservice.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController
{
    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public List<LMSUser> getAllUsers()
    {

       return userService.getAllUsers();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addUser(@RequestBody LMSUser user)
    {
        userService.addUser(user);
    }


    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void deleteUserById(@PathVariable long id)
    {
        userService.deleteUserById(id);
    }

    @RequestMapping("/{Id}")
    public Optional<LMSUser> getUserById(@PathVariable long Id)
    {
        return userService.getUserById(Id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{id}" )
    public void updateUser(@RequestBody LMSUser user, @PathVariable long id )
    {
        userService.updateUser(id, user);
    }

}