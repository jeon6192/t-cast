package com.taekwang.tcast.repository;

import com.taekwang.tcast.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findById(String id);

    Optional<User> findByOauthTypeAndOauthId(String oauthType, String oauthId);

    boolean existsById(String id);
}
