package com.thesearch.mylaptopshop.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.thesearch.mylaptopshop.model.ForgotPassword;
import com.thesearch.mylaptopshop.model.User;

public interface ForgotPasswordRepository extends JpaRepository<ForgotPassword, Integer>{
    @Query("select fp from ForgotPassword fp where fp.otp = ?1 and fp.user = ?2")
    Optional<ForgotPassword> findByOtpAndUser(Integer otp, User user);
    
    @Query("select fp from ForgotPassword fp where fp.user = ?1")
    Optional<ForgotPassword> findByUser(User user);
}
