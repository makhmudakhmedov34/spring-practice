package com.cydeo.repository;

import com.cydeo.entity.Account;
import com.cydeo.entity.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository extends JpaRepository<Cinema, Long> {

    // ------------------- JPQL QUERIES ------------------- //

    //Write a JPQL query that return all genres

    // ------------------- Native QUERIES ------------------- //

    //Write a native query that returns genres by containing name

}
