package com.nesterrovv.vpnfilemanager.repository;

import com.nesterrovv.vpnfilemanager.model.FileDB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileDBRepository extends JpaRepository<FileDB, String> {

}
