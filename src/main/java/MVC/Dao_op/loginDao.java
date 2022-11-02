package MVC.Dao_op;

import MVC.Model.AdminEntity;
import org.hibernate.Session;

public class loginDao {
    public Boolean insertAdmin(String username, String password) {
        AdminEntity admin = null;
        try {
            Session session = SessionUtil.getCurrentSession();
            session.getTransaction();
            session.getTransaction().begin();
            admin = (AdminEntity) session.createQuery("SELECT U FROM AdminEntity U WHERE U.username = :username ").setParameter("username", username).uniqueResult();
            System.out.println(admin.getUsername());
            System.out.println(admin.getPassword());
            if (admin != null && admin.getPassword().equals(password)) {
                return true;
            }
            session.persist(admin);
            session.getTransaction().commit();
            session.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("error");
        }
        return false;
    }
}
