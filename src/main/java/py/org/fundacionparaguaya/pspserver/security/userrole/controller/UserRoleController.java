package py.org.fundacionparaguaya.pspserver.security.userrole.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import py.org.fundacionparaguaya.pspserver.security.userrole.domain.UserRoleEntityDTO;
import py.org.fundacionparaguaya.pspserver.security.userrole.service.UserRoleService;

@RestController
@RequestMapping(value = "/api/v1/user-roles")
public class UserRoleController {

	
	private UserRoleService userRoleService;

	
	@Autowired
	public UserRoleController(UserRoleService userRoleService) {
		this.userRoleService = userRoleService;
	}
	
	
	@PostMapping()
	public ResponseEntity<UserRoleEntityDTO> addUserRole(@RequestBody UserRoleEntityDTO userRole) {
		return userRoleService.addUserRole(userRole);
	}
	
	

	@PutMapping()
	public ResponseEntity<Void> updateUserRole(@RequestBody UserRoleEntityDTO userRole) {
		return userRoleService.updateUserRole(userRole);
	}
	
	
	
	@DeleteMapping("/{userRoleId}")
	public ResponseEntity<Void> deleteUserRole(@PathVariable("userRoleId") Long userRoleId) {
		return userRoleService.deleteUserRole(userRoleId);
	}
	
	
	
	@GetMapping("/{userRoleId}")
	public ResponseEntity<UserRoleEntityDTO> getUserRoleById(@PathVariable("userRoleId") Long userRoleId) {
		return userRoleService.getUserRoleById(userRoleId);
	}
	


	@GetMapping()
	public ResponseEntity<List<UserRoleEntityDTO>> getAllUserRoles() {
		return userRoleService.getAllUserRoles();
	}
	
	
}