package com.Hemant.UserManagment.Service;

import com.Hemant.UserManagment.model.User;
import com.Hemant.UserManagment.repo.IuserRepo;
import jakarta.validation.constraints.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Service
public class UserService {
    @Autowired
    IuserRepo iuserRepo;


    public String addStocks(List<User> newvalidation) {
        for(User vl:newvalidation){
            vl.setDate(LocalDate.now());
            vl.setTime(LocalTime.now());

        }
        iuserRepo.saveAll(newvalidation);
        return "Added";
    }

    public User getUserId(Integer id) {
        return iuserRepo.findById(id).get();
    }

    public List<User> getAllByUser() {
        return (List<User>) iuserRepo.findAll();
    }

    public String updateUserById(Integer id, String userName) {
        User userinfo = iuserRepo.findById(id).orElse(null);
        if (userinfo != null){
            userinfo.setUserName(userName);
            iuserRepo.save(userinfo);
            return " User Id Updated Successfully";
        }
        return "user not found";
    }

    public String DeletuserById(Integer id) {
        iuserRepo.deleteById(id);
        return "User id deleted.";
    }
}
