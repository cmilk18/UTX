package com.midsangam.utx.services;

import com.midsangam.utx.Dto.AdminDto;
import com.midsangam.utx.model.Admin;

import java.util.List;

public interface AdminService {
    public void createAdmin(AdminDto adminDto);

    public Admin readAdminById(String adminId);

    public List<Admin> readAllAdmin();

    public Admin updateAdmin(AdminDto adminDto);

    public void deleteAdminById(String adminId);
}
