package hellojpa;

import jakarta.persistence.*;

@Entity
public class Locker {
    @Id@GeneratedValue
    private Long id;
    private String name;
    @OneToOne(mappedBy = "locker")
    private MemberData memberData;

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

    public MemberData getMemberData() {
        return memberData;
    }

    public void setMemberData(MemberData memberData) {
        this.memberData = memberData;
    }
}
