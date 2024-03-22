package hellojpa;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class MemberData {
    @Id@GeneratedValue
    private Long id;
    @Column(name = "USERNAME")
    private String name;
    @Column(name = "USERNAME")
    private String username;
   @ManyToOne
   @JoinColumn(insertable = false, updatable = false,name = "TEAM_ID")//추가,업데이트가 없는 읽기전용
    private Team team;
    @OneToOne
    @JoinColumn(name = "LOCKER_ID")
    private Locker locker;

    @ManyToMany
    @JoinColumn(name = "MEMBER_PRODUCT")
    private List<Product> products=new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
