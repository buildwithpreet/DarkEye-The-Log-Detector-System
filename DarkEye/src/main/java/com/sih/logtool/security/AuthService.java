package com.sih.logtool.security;

public interface AuthService {
    boolean authenticate(String username, String password);
}
