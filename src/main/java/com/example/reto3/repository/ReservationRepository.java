package com.example.reto3.repository;

import com.example.reto3.entities.Reservation;
import com.example.reto3.repository.crudRepository.ReservationCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ReservationRepository {

    @Autowired
    private ReservationCrudRepository reservationCrudRepository;

    public List<Reservation> getAll(){return (List<Reservation>) reservationCrudRepository.findAll();}
    public Optional<Reservation> getReservation(int idReservation){return  reservationCrudRepository.findById(idReservation);}
    public Reservation save(Reservation c){return reservationCrudRepository.save(c);}
    public void delete(Reservation c) {
        reservationCrudRepository.delete(c);}
}
