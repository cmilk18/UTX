package com.midsangam.utx.controller;

import com.midsangam.utx.Dto.AdminDto;
import com.midsangam.utx.Dto.CustomerDto;
import com.midsangam.utx.model.Admin;
import com.midsangam.utx.model.Customer;
import com.midsangam.utx.services.AdminService;
import com.midsangam.utx.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("admin")
@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping
    public String create(@RequestBody AdminDto adminDto){
        adminService.createAdmin(adminDto);
        return "Customer Created!";
    }

    @GetMapping("{adminId}")
    public Admin readById(@PathVariable String adminId){
        Admin admin = adminService.readAdminById(adminId);
        return admin;
    }

    @GetMapping("/all")
    public List<Admin> readAll(){
        List<Admin> admins = adminService.readAllAdmin();
        return admins;
    }

    @PutMapping
    public Admin update(@RequestBody AdminDto adminDto){
        Admin admin = adminService.updateAdmin(adminDto);
        return admin;
    }

    @DeleteMapping("{adminId}")
    public String delete(@PathVariable String adminId){
        adminService.deleteAdminById(adminId);
        return "Deleted!";
    }
}
