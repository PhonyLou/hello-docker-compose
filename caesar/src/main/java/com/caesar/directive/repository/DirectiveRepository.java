package com.caesar.directive.repository;

import com.caesar.directive.entity.Directive;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DirectiveRepository extends JpaRepository<Directive, Long> {

}
