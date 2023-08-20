package com.virtusa.finals.entity;


import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class CustomUserDetails implements UserDetails {
	private User user;
	private List<GrantedAuthority> authorities;
	public CustomUserDetails() {
		

	}

	public CustomUserDetails(User user) {
		this.user=user;

	}

//@override annotation indicates that the child class method is over writing its base class method
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {

		return authorities;
	}
	//@override annotation indicates that the child class method is over writing its base class method

	@Override
	public String getPassword() {

		return user.getPassword();
	}
	//@override annotation indicates that the child class method is over writing its base class method
	@Override
	public String getUsername() {

		return user.getPassword();
	}
	//@override annotation indicates that the child class method is over writing its base class method
	@Override
	public boolean isAccountNonExpired() {

		return true;
	}
	//@override annotation indicates that the child class method is over writing its base class method
	@Override
	public boolean isAccountNonLocked() {

		return true;
	}
	//@override annotation indicates that the child class method is over writing its base class method
	@Override
	public boolean isCredentialsNonExpired() {

		return true;
	}
	//@override annotation indicates that the child class method is over writing its base class method
	@Override
	public boolean isEnabled() {

		return true;
	}

}
