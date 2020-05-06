package com.postman.directive.repository;

import com.postman.directive.entity.Directive;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DirectiveRepository extends JpaRepository<Directive, Long> {
    @Query(
            value = "SELECT * FROM directive order by id desc limit 1",
            nativeQuery = true)
    Directive getCommand();
}
