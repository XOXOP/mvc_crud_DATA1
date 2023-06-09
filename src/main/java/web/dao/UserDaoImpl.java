package web.dao;

import org.springframework.stereotype.Repository;
import web.entity.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;
@Repository
public class UserDaoImpl implements  UserDao {
    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public List<User> getUsers() {
        TypedQuery<User> query = entityManager.createQuery("from User", User.class);
        return query.getResultList();

    }

    @Override
    public void saveUser(User userSave) {
        entityManager.persist(userSave);
    }

    @Override
    public void deleteUser(Long idDelete) {

        Query query = entityManager.createQuery("delete from User where id =: id_user");
        query.setParameter("id_user", idDelete).executeUpdate();
    }

    @Override
    public User findUser(Long idFind) {
        User findUser = entityManager.find(User.class, idFind);
        return findUser;
    }

    @Override
    public void updateUser(User userUpdate) {
        entityManager.merge(userUpdate);
    }

}


