package MVC.Dao_op;

import MVC.Model.ApprenanteEntity;
import MVC.Model.FormateurEntity;
import MVC.Model.PromotionEntity;
import org.hibernate.Session;
import java.util.List;

public class adminDao {

    //    =============>  formateur  <=================

    //    admin add formatuer
    public void addformateur(FormateurEntity formateur) {
        try  {
            Session session = SessionUtil.getCurrentSession();
            session.getTransaction();
            session.getTransaction().begin();
            // save the student object
            session.save(formateur);
            session.persist(formateur);
            session.getTransaction().commit();
            session.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("error");
            e.printStackTrace();
        }
    }

    // get data of all formatuer
    public List< FormateurEntity > getAllformatuer() {
        List< FormateurEntity > listOfUser_formateur = null;
        try {
            Session session = SessionUtil.getCurrentSession();
            session.getTransaction();
            session.getTransaction().begin();
            // get an user object
            listOfUser_formateur = session.createQuery("from FormateurEntity ").getResultList();
            // commit transaction
            session.getTransaction().commit();
            session.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("error");
            e.printStackTrace();
        }
        return listOfUser_formateur;
    }

    //   admin update formatuer
    public void updateformatuer(FormateurEntity user) {
        try{
            // start a transaction
            Session session = SessionUtil.getCurrentSession();
            session.getTransaction();
            session.getTransaction().begin();
            // save the student object
            session.update(user);
            // commit transaction
            session.persist(user);
            session.getTransaction().commit();
            session.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("error");
            e.printStackTrace();
        }
    }

    //    admin delete formatuer
    public void deleteformateur(int id) {
        try {
            // start a transaction
            Session session = SessionUtil.getCurrentSession();
            session.getTransaction();
            session.getTransaction().begin();

            // Delete a user object
            FormateurEntity formateur = session.get(FormateurEntity.class, id);
            if (formateur != null) {
                session.delete(formateur);
                System.out.println("user is deleted");
            }
            // commit transaction
            session.getTransaction().commit();
            session.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("error");
            e.printStackTrace();
        }
    }


//    =============>  apprenanate <=================


    //    admin add apprenanate
    public void addapprenanate(ApprenanteEntity apprenante) {
        try  {
            Session session = SessionUtil.getCurrentSession();
            session.getTransaction();
            session.getTransaction().begin();
            // save the student object
            session.save(apprenante);
            session.persist(apprenante);
            session.getTransaction().commit();
            session.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    // get data of all apprenanate
    public List< ApprenanteEntity > getAllapprenanate() {
        List< ApprenanteEntity > listOfUser_apprenanate = null;
        try {
            Session session = SessionUtil.getCurrentSession();
            session.getTransaction();
            session.getTransaction().begin();
            // get an user object
            listOfUser_apprenanate = session.createQuery("from ApprenanteEntity ").getResultList();
            // commit transaction
            session.getTransaction().commit();
            session.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return listOfUser_apprenanate;
    }

    //   admin update apprenanate
    public void updateapprenanate(ApprenanteEntity user) {
        try{
            // start a transaction
            Session session = SessionUtil.getCurrentSession();
            session.getTransaction();
            session.getTransaction().begin();
            // save the student object
            session.update(user);
            // commit transaction
            session.persist(user);
            session.getTransaction().commit();
            session.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
    //    admin delete apprenanate
    public void deleteapprenanate(int id) {
        try {
            // start a transaction
            Session session = SessionUtil.getCurrentSession();
            session.getTransaction();
            session.getTransaction().begin();

            // Delete a user object
            ApprenanteEntity apprenanate = session.get(ApprenanteEntity.class, id);
            if (apprenanate != null) {
                session.delete(apprenanate);
            }
            // commit transaction
            session.getTransaction().commit();
            session.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    //    =============>  promotion  <=================

    //    admin add promotion
    public void addpromotion(PromotionEntity promotion) {
        try  {
            Session session = SessionUtil.getCurrentSession();
            session.getTransaction();
            session.getTransaction().begin();
            // save the student object
            session.save(promotion);
            session.persist(promotion);
            session.getTransaction().commit();
            session.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    // get data of all promotion
    public List< PromotionEntity > getAllpromotion() {
        List< PromotionEntity > listOfUser_promotion = null;
        try {
            Session session = SessionUtil.getCurrentSession();
            session.getTransaction();
            session.getTransaction().begin();
            // get an user object
            listOfUser_promotion = session.createQuery("from PromotionEntity ").getResultList();
            // commit transaction
            session.getTransaction().commit();
            session.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return listOfUser_promotion;
    }

    //   admin update promotion
    public void updatepromotion(PromotionEntity promotion) {
        try{
            // start a transaction
            Session session = SessionUtil.getCurrentSession();
            session.getTransaction();
            session.getTransaction().begin();
            // save the student object
            session.update(promotion);
            // commit transaction
            session.persist(promotion);
            session.getTransaction().commit();
            session.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    //    admin delete promotion
    public void deletepromotion(int id) {
        try {
            // start a transaction
            Session session = SessionUtil.getCurrentSession();
            session.getTransaction();
            session.getTransaction().begin();

            // Delete a user object
            PromotionEntity promotion = session.get(PromotionEntity.class, id);
            if (promotion != null) {
                session.delete(promotion);
            }
            // commit transaction
            session.getTransaction().commit();
            session.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }


}
