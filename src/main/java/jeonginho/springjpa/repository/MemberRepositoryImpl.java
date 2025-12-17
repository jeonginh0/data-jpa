package jeonginho.springjpa.repository;

import jakarta.persistence.EntityManager;
import java.util.List;
import jeonginho.springjpa.entity.Member;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MemberRepositoryImpl implements MemberRepositoryCustom {
    private final EntityManager em;

    @Override
    public List<Member> findMemberCustom() {
        return em.createQuery("select m from Member m", Member.class).getResultList();
    }
}
