package ca.sait.lab8security.dataaccess;

import javax.persistence.EntityManager;
import ca.sait.lab8security.models.User;


public class UserDB {
    public User get(String email) {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        
        try {
            User user = em.find(User.class, email);
            return user;
        } finally {
            em.close();
        }
    }
}
