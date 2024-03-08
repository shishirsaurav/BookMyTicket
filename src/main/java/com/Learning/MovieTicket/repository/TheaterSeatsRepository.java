package com.Learning.MovieTicket.repository;


import com.Learning.MovieTicket.domain.TheaterSeats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TheaterSeatsRepository extends JpaRepository<TheaterSeats, Long> {

}