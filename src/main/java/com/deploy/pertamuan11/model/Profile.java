package com.deploy.pertamuan11.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@Table(name = "profiles")
@AllArgsConstructor
@NoArgsConstructor
public class Profile {
	@Id
	private String id;

	private String nama;

	private String alamat;

	@OneToOne
	@JoinColumn(name = "user_id")
	private User user;
}
