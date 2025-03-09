package edu.icet.service.Impl;

import edu.icet.entity.User;
import edu.icet.repository.UserRepository;
import edu.icet.service.UserService;
<<<<<<< HEAD
=======
import org.mindrot.jbcrypt.BCrypt;
>>>>>>> 3124de1 (Final Commit)
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void registerUser(User user) {
<<<<<<< HEAD
=======
        // Hash the password before saving
        String hashedPassword = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
        user.setPassword(hashedPassword);
>>>>>>> 3124de1 (Final Commit)
        userRepository.save(user); // Save the user to the database
    }

    @Override
    public boolean authenticateUser(String username, String password) {
        User user = userRepository.findByUsername(username).orElse(null);
<<<<<<< HEAD
        if (user != null && user.getPassword().equals(password)) {
            return true;
        }
        return false;
=======
        if (user != null && BCrypt.checkpw(password, user.getPassword())) {
            return true; // Password matches
        }
        return false; // Invalid username or password
>>>>>>> 3124de1 (Final Commit)
    }
}