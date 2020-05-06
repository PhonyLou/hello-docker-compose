package com.caesar.directive.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Directive {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String directive;

    public Directive(Long id, String directive) {
        this.id = id;
        this.directive = directive;
    }

    public Directive(String directive) {
        this.directive = directive;
    }

    public Directive() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDirective() {
        return directive;
    }

    public void setDirective(String name) {
        this.directive = name;
    }
}
