package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Todo;

import org.springframework.stereotype.Repository;

@Repository
public interface Todorepo extends JpaRepository<Todo, Long> {

}
