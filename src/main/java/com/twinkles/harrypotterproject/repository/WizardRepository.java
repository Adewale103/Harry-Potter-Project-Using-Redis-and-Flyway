package com.twinkles.harrypotterproject.repository;

import com.twinkles.harrypotterproject.entity.Wizard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface WizardRepository extends JpaRepository<Wizard, UUID> {

}
