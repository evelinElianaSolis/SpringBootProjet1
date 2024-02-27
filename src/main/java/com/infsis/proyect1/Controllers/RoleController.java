package com.infsis.proyect1.Controllers;

import com.infsis.proyect1.DTOs.UserDTO;
import com.infsis.proyect1.Models.Role;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Role")
public class RoleController {
    @GetMapping()
    public ResponseEntity<Role> getRoles() {
        Role role = new Role(1, "name");
        return ResponseEntity.ok().body(role);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Role>  getRole(@PathVariable Integer id){
        Role role =  new Role(1,"name");
        return ResponseEntity.ok().body(role);

    }
    @PostMapping("/{id}")
    public ResponseEntity<Role> postRole(@RequestBody Role role){
        return ResponseEntity.ok().body(role);
    }
    @PutMapping("/{id}")
    public  ResponseEntity<Role> updateRole(@PathVariable Integer id, @RequestBody Role role){
        return ResponseEntity.ok().body(role);
    }

    @DeleteMapping("/{id}")
    public void deleteRole(@PathVariable Integer id) {

    }
}
