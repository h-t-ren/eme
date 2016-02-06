package com.huihuan.eme;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.huihuan.eme.service.GroupsService;
import com.huihuan.eme.service.UserService;

@Service
@Transactional
public class DatabaseInit {
	@Autowired private GroupsService groupsService;
	@Autowired private UserService userService;
	
	public void init()
	{
		groupsService.loadDefaultGroups();
		userService.loadDefaultUsers();
	}

}
