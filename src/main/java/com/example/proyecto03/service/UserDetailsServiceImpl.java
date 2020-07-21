package com.example.proyecto03.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;



import com.example.proyecto03.interfaces.IUsuario;
import com.example.proyecto03.modelo.Authority;
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	@Autowired
    IUsuario userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		idat.com.demo.modelo.Usuario appUser = 
				  userRepository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("No existe usuario"));
		

	    List grantList = new ArrayList();
	    for (Authority authority: appUser.getAuthority()) {
	       
	        GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(authority.getAuthority());
	            grantList.add(grantedAuthority);
	    }
			

	    UserDetails user = (UserDetails) new User(appUser.getUsername(), appUser.getPassword(), grantList);
	         return user;
	    }
	}