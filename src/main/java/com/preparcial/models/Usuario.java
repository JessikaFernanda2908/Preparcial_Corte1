package com.preparcial.models;

import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;

    @ManyToOne
    @JoinColumn(name = "rol_id")
    private Rol rol;
    
	public Usuario() {
		super();
	}

	public Usuario(Long id, String username, String password, Rol rol) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.rol = rol;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

    

}