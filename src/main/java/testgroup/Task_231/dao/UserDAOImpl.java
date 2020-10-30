package testgroup.Task_231.dao;

import org.springframework.stereotype.Repository;
import testgroup.Task_231.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Repository
public class UserDAOImpl implements UserDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public List<User> allUsers() {
        return entityManager
                .createQuery("from User", User.class)
                .getResultList();
    }

    public void add(User user) {
        entityManager.persist(user);
    }

    public void delete(User user) {
        entityManager.remove(user);
    }

    public void edit(User user) {
        entityManager.merge(user);
    }

    public User getById(int id) {
        return entityManager.find(User.class, id);
    }
}
