package com.almasjss.TestTask.service;

import com.almasjss.TestTask.constants.Constants;
import com.almasjss.TestTask.entity.User;
import com.almasjss.TestTask.helpers.CheckUniqueness;
import com.almasjss.TestTask.helpers.PasswordValidation;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {
    private final HashMap<String, User> users = new HashMap<>();
    private final Map<String, String> tokens = new HashMap<>();
    private final Map<String, String> blackListTokens = new HashMap<>();

    public String setUser(User user) {
        if (users.containsKey(user.getLogin()) || CheckUniqueness.check(users, user)) {
            return Constants.USER_ALREADY_EXIST;
        }
        if (!PasswordValidation.passwordValidation(user.getPassword())) {
            return Constants.PASSWORD_SHOULD_BE_STRONG;
        }
        users.put(user.getLogin(), user);
        return Constants.OK;
    }

    public String setUpdateUser(User user) {
        if (!PasswordValidation.passwordValidation(user.getPassword())) {
            return Constants.PASSWORD_SHOULD_BE_STRONG;
        }
        users.replace(user.getLogin(), user);
        return Constants.OK;
    }

    public User getUser(String login) {
        return users.get(login);
    }

    public Map<String, User> getUsers() {
        return users;
    }

    public void deleteUser(String login) {
        users.remove(login);
    }

    public Map<String, String> getTokens() {
        return tokens;
    }

    public void addToken(String login, String token) {
        tokens.put(login, token);
    }

    public void removeToken(String login, String token) {
        tokens.remove(login, token);
    }

    public Map<String, String> getBlackListTokens() {
        return blackListTokens;
    }

    public void addBlackToken(String login, String token) {
        blackListTokens.put(login, token);
    }

    public void removeBlackToken(String login, String token) {
        blackListTokens.remove(login, token);
    }
}
