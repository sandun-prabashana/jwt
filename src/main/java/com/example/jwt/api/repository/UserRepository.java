package com.example.jwt.api.repository;

import com.example.jwt.api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Sandun Prabashana <sandunprabashana@gmail.com> (prabashana.tk/)
 * @since 10/5/2021
 */
public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUserName(String username);
}
