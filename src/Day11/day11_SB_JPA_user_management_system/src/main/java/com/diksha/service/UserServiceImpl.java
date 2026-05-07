package com.diksha.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.diksha.entity.User;
import com.diksha.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo usrRepo;
	@Override
	public User saveUser(User u) {
		// TODO Auto-generated method stub
		return usrRepo.save(u);
	}

	@Override
	public Page<User> showActiveUsers(int page, int size) {
		// TODO Auto-generated method stub
		PageRequest pageable = PageRequest.of(page, size);

        return usrRepo.findByDeletedFalse(pageable);
	}

	@Override
	public void softDelete(int id) {
		// TODO Auto-generated method stub
			User user= usrRepo.findById(id);
			if (user != null) {

	            user.setDeleted(true);

	            user.setDeletedAt(LocalDateTime.now());

	            usrRepo.save(user);
	        }
	}

}
