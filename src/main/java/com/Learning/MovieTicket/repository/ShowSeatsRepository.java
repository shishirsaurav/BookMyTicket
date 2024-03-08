package com.Learning.MovieTicket.repository;


import com.Learning.MovieTicket.domain.ShowSeat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowSeatsRepository extends JpaRepository<ShowSeat, Long> {

}