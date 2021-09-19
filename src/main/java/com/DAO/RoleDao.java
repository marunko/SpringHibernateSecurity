package com.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Entity.User_Role;

@Repository
@Transactional
public class RoleDao {
    @Autowired
    private EntityManager entityManager;

    public List<String> getRoleNames(int userId) {
        String sql = "Select ur.role.role_name from " + User_Role.class.getName() + " ur " //
                + " where ur.user.id = :userId ";

        TypedQuery<String> query = entityManager.createQuery(sql, String.class);
        query.setParameter("userId", userId); // sets param name in query
        return query.getResultList();
    }

}
