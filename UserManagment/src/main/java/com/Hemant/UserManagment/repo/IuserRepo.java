package com.Hemant.UserManagment.repo;

import com.Hemant.UserManagment.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IuserRepo extends CrudRepository<User,Integer>{

}
