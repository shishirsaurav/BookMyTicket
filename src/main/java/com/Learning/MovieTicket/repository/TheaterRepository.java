package com.Learning.MovieTicket.repository;


import com.Learning.MovieTicket.domain.Theater;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TheaterRepository extends JpaRepository<Theater, Long> {

}