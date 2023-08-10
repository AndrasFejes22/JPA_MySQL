package dao;

import model.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UserDao {

    private static EntityManagerFactory emf; //ez egy JPA-s interface

    public UserDao() {
        this.emf = Persistence.createEntityManagerFactory("myDB");
    }

    //create, read, update, delete = CRUD, EntityManager elsődleges feladatok

    public User getUserBId(Long id) {
        EntityManager entityManager = emf.createEntityManager();
        return entityManager.find(User.class, id);
    }
}
