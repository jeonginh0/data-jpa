package jeonginho.springjpa.repository;

import java.util.List;
import jeonginho.springjpa.entity.Member;

public interface MemberRepositoryCustom {
    List<Member> findMemberCustom();

}
