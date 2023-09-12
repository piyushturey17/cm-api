package in.codegram.cmapi.domain;

import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.validation.constraints.NotBlank;

@Entity
public class Report {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank(message = "Student name can not be empty")
	private String name;
	@NotBlank(message = "Batch  name can not be empty")
	private String batch;
	@NotBlank(message = "Technology name can not be empty")
	private String technology;
	private Date report_create_At;
	private Date report_update_At;

	public Report() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBatch() {
		return batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public Report(Long id, String name, String batch, String technology) {
		super();
		this.id = id;
		this.name = name;
		this.batch = batch;
		this.technology = technology;
	}

	public Date getReport_create_At() {
		return report_create_At;
	}

	public void setReport_create_At(Date report_create_At) {
		this.report_create_At = report_create_At;
	}

	public Date getReport_update_At() {
		return report_update_At;
	}

	public void setReport_update_At(Date report_update_At) {
		this.report_update_At = report_update_At;
	}

	@PrePersist
	public void onCreate() {
		this.report_create_At = new Date();
	}

	@PreUpdate
	public void onUpdate() {
		this.report_update_At = new Date();
	}

}