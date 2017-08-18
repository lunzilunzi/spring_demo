package com.zx.model;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author ${author}
 * @since 2017-08-18
 */
public class Staff extends Model<Staff> {

    private static final long serialVersionUID = 1L;

	@TableId(value="staff_id", type= IdType.AUTO)
	private Integer staffId;
	@TableField("first_name")
	private String firstName;
	@TableField("last_name")
	private String lastName;
	@TableField("address_id")
	private Integer addressId;
	private String picture;
	private String email;
	@TableField("store_id")
	private Integer storeId;
	private Integer active;
	private String username;
	private String password;
	@TableField("last_update")
	private Date lastUpdate;


	public Integer getStaffId() {
		return staffId;
	}

	public void setStaffId(Integer staffId) {
		this.staffId = staffId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getStoreId() {
		return storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	public Integer getActive() {
		return active;
	}

	public void setActive(Integer active) {
		this.active = active;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	@Override
	protected Serializable pkVal() {
		return this.staffId;
	}

	@Override
	public String toString() {
		return "Staff{" +
			"staffId=" + staffId +
			", firstName=" + firstName +
			", lastName=" + lastName +
			", addressId=" + addressId +
			", picture=" + picture +
			", email=" + email +
			", storeId=" + storeId +
			", active=" + active +
			", username=" + username +
			", password=" + password +
			", lastUpdate=" + lastUpdate +
			"}";
	}
}
