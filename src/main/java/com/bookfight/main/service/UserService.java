/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bookfight.main.service;

import com.bookfight.main.domain.User;
import com.bookfight.main.domain.VerificationToken;
import com.bookfight.main.validation.EmailExistsException;

/**
 *
 * @author Alfie
 */
public interface UserService {

    public User findUserByEmail(String email);

    public void saveUser(User user);

    public void registerNewUserAccount(User user);

    User getUser(String verificationToken);

    void createVerificationToken(User user, String token);

    VerificationToken getVerificationToken(String VerificationToken);

}
