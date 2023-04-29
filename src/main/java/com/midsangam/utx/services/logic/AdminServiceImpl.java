package com.midsangam.utx.services.logic;

import com.midsangam.utx.Dto.AdminDto;
import com.midsangam.utx.model.Admin;
import com.midsangam.utx.repository.AdminRepository;
import com.midsangam.utx.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepository adminRepository;

    @Override
    public void createAdmin(AdminDto adminDto) {
        Admin admin = new Admin(adminDto);
        adminRepository.save(admin);
    }

    @Override
    public Admin readAdminById(String adminId) {
        Admin admin = adminRepository.findById(adminId).get();
        return admin;
    }

    @Override
    public List<Admin> readAllAdmin() {
        List<Admin> admins = adminRepository.findAll();
        return admins;
    }

    @Override
    public Admin updateAdmin(AdminDto adminDto) {
        Admin admin = new Admin(adminDto);
        Admin updatedAdmin = adminRepository.save(admin);
        return updatedAdmin;
    }

    @Override
    public void deleteAdminById(String adminId) {
        adminRepository.deleteById(adminId);
    }
}
