package com.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "role", //
        uniqueConstraints = { //
                @UniqueConstraint(name = "APP_ROLE_UK", columnNames = "role_name") })
public class Role {
	@Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "role_name", length = 30, nullable = false)
    private String name;
	
	public int getRoleId() {
        return id;
    }

    public void setRoleId(int id) {
        this.id = id;
    }

    public String getRoleName() {
        return name;
    }

    public void setRoleName(String name) {
        this.name = name;
    }
}
