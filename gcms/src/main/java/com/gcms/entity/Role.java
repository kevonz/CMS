package com.gcms.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the g_role database table.
 * 
 */
@Entity
@Table(name="g_role")
public class Role implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="role_id")
	private int roleId;

	@Column(name="is_default")
	private byte isDefault;

	@Column(name="need_captcha")
	private byte needCaptcha;

	@Column(name="need_check")
	private byte needCheck;

	private int priority;

	@Column(name="role_name")
	private String roleName;

	private int status;

	//bi-directional many-to-one association to GUser
	@OneToMany(mappedBy="Role")
	private List<User> Users;

	public Role() {
	}

	public int getRoleId() {
		return this.roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public byte getIsDefault() {
		return this.isDefault;
	}

	public void setIsDefault(byte isDefault) {
		this.isDefault = isDefault;
	}

	public byte getNeedCaptcha() {
		return this.needCaptcha;
	}

	public void setNeedCaptcha(byte needCaptcha) {
		this.needCaptcha = needCaptcha;
	}

	public byte getNeedCheck() {
		return this.needCheck;
	}

	public void setNeedCheck(byte needCheck) {
		this.needCheck = needCheck;
	}

	public int getPriority() {
		return this.priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public List<User> getUsers() {
		return this.Users;
	}

	public void setUsers(List<User> Users) {
		this.Users = Users;
	}

}