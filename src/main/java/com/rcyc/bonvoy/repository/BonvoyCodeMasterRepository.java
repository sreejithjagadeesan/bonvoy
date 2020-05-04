package com.rcyc.bonvoy.repository;

import com.rcyc.bonvoy.model.BonvoyCodeMaster;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BonvoyCodeMasterRepository extends JpaRepository<BonvoyCodeMaster, Long> {

    Optional<BonvoyCodeMaster> findByCode(String code);
}
