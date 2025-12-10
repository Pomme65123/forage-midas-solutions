package com.jpmc.midascore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpmc.midascore.entity.UserRecord;

@Repository
public interface UserRecordRepository extends
JpaRepository<UserRecord, String> {}
