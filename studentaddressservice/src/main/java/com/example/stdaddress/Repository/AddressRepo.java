package com.example.stdaddress.Repository;

import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.stdaddress.entity.StudentAddress;

@Repository
public interface AddressRepo extends JpaRepository<StudentAddress, Integer> {

    @Query(
        nativeQuery = true,
        value
        = "SELECT * FROM std_address sa JOIN std s ON sa.std_rollno = s.rollno where sa.std_rollno=:stdRollno")
       Optional<StudentAddress> findAddressByStudentRollno(@Param("stdRollno")  int stdRollno);
}
