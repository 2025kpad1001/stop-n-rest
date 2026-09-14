package com.stopnrest.repository;
import com.stopnrest.model.Room; import org.springframework.data.jpa.repository.JpaRepository;
public interface RoomRepository extends JpaRepository<Room,Long> {}