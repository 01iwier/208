package com.example.a208.data;

import android.content.Intent;

import com.example.a208.data.model.LoggedInUser;
import com.example.a208.ui.login.LoginActivity;

import java.io.IOException;

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
public class LoginDataSource {

    public Result<LoggedInUser> login(String username, String password) {

        try {
            // TODO: handle loggedInUser authentication
            if (username.equals("username") && password.equals("password")) {
                LoggedInUser fakeUser = new LoggedInUser(java.util.UUID.randomUUID().toString(),"User");
                return new Result.Success<>(fakeUser);
            }
            return null;
        } catch (Exception e) {
            return new Result.Error(new IOException("Error logging in", e));
        }
    }

    public void logout() {
        // TODO: revoke authentication
    }
}