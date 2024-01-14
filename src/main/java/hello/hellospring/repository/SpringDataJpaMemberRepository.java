package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {

    // 단순한 쿼리들은 인터페이스로 해결 가능
    // JPOL select m from Member m where m.name = ?
    @Override
    Optional<Member> findByName(String name);
}
