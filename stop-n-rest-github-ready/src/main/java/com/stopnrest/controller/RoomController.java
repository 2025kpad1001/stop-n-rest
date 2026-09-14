package com.stopnrest.controller;
import com.stopnrest.model.Room; import com.stopnrest.repository.RoomRepository; import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController @RequestMapping("/api/rooms")
public class RoomController {
 private final RoomRepository repo; public RoomController(RoomRepository r){repo=r;}
 @GetMapping public List<Room> all(){return repo.findAll();}
 @PostMapping public Room add(@RequestBody Room r){return repo.save(r);}
}