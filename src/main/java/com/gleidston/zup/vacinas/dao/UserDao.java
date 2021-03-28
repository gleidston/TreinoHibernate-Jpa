package com.gleidston.zup.vacinas.dao;

import com.gleidston.zup.vacinas.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

@Repository
@Transactional
public class UserDao {

    @Autowired
    private SessionFactory factory;

    public Session getSession() {
        Session session = factory.getCurrentSession();
        if (session == null) {
            session = factory.openSession();
        }

        return session;
    }

    public void saveuser(User user) {
        getSession().save(user);
    }

    @SuppressWarnings("deprecation")
    public List<User> getuser() {
        return getSession().createCriteria(User.class).list();
    }
}
