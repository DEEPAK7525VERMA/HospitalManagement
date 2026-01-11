package com.deepak.twitch.hospitalmanagement.repository;

import com.deepak.twitch.hospitalmanagement.Entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {
}
