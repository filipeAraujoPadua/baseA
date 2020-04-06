package basea.baseA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import basea.baseA.entity.BaseA;

@Repository
public interface BaseARepository extends JpaRepository<BaseA, Integer>{

}
