package com.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.bean.UserAccount;


public interface Userrepository extends JpaRepository<UserAccount,String>
{

}
