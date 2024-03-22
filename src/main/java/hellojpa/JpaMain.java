package hellojpa;

import hellojpa.domain.Order;
import hellojpa.domain.OrderItem;
import jakarta.persistence.*;

import java.util.List;

public class JpaMain {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        //설정
        EntityManager em = emf.createEntityManager();
        //code
        EntityTransaction tx=em.getTransaction();
        //변경 사항 확인
        tx.begin();
        try {



            tx.commit();//db저장 하드에 저장
        }catch (Exception e){
            tx.rollback();
        }finally {
            em.clear();
        }
        emf.close();
    }
}
