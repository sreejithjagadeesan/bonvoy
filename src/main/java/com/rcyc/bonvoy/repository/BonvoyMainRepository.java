package com.rcyc.bonvoy.repository;

import com.rcyc.bonvoy.model.BonvoyMain;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BonvoyMainRepository extends JpaRepository<BonvoyMain, Long> {

}
