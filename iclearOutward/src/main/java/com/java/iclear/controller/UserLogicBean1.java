package com.java.iclear.controller;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;

@Component
public class UserLogicBean1 {
    // A Spring Data JPA repo
    private final UserEntityRepository repo;

    @Autowired
    public UserLogicBean(UserEntityRepository repo) {
        this.repo = repo;
    }

    public boolean hasPermission(String username, PermissionEntity permission) {
        List<PermissionEntity> userPermissions = retrieveUserPermissions(username);
        return userPermissions.contains(permission);
    }

    @Transactional(readOnly = true)
    public List<PermissionEntity> retrieveUserPermissions(String username) {
        try {
            UserEntity user = repo.findByUsername(username);
            if (user != null) {
                return user.getPermissions();
            } else {
                return Collections.emptyList(); // User not found
            }
        } catch (Exception ex) {
            // Handle the exception, e.g., log it
            ex.printStackTrace();
            return Collections.emptyList(); // Return an empty list in case of an error
        }
    }
}


/*


@Component
public class UserLogicBean {
    // A Spring Data JPA repo
    @Autowired
    private UserEntityRepository repo;

    public boolean hasPermission(String username, PermissionEntity permission) {
        return retrieveUserPermissions(username).contains(permission);
    }

    @Transactional(readOnly = true)
    public List<PermissionEntity> retrieveUserPermissions(String username) {
        return repo.findByUsername(username).getPermissions();
    }
}

*/
