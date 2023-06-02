package com.imrul.app.rest.Repo;

import com.imrul.app.rest.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {

}
