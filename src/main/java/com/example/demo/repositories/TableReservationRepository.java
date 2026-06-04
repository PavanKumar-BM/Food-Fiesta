package com.example.demo.repositories;

import com.example.demo.entities.TableReservation;
import com.example.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TableReservationRepository extends JpaRepository<TableReservation, Integer> {
    List<TableReservation> findByUser(User user);
}
