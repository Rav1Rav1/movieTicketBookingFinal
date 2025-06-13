package com.movieTicket.movieTicket.repository;



import com.movieTicket.movieTicket.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    User findByEmail(String email);
}
