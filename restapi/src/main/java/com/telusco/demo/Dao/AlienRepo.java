package com.telusco.demo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.telusco.demo.Model.Aliens;

public interface AlienRepo extends JpaRepository<Aliens, Integer>{

}
