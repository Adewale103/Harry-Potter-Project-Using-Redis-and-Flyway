package com.twinkles.harrypotterproject.repository;

import com.twinkles.harrypotterproject.entity.MasterHouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MasterHouseRepository extends JpaRepository<MasterHouse, UUID> {

}
