package com.rebatesadmin.security;

public interface SecurityService {

    void autoLogin(String username, String password) throws Exception;
}
