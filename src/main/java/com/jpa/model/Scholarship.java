package com.jpa.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Scholarship {

    @Id
    private Long scholarshipId;
    private String name;
    private String type;
    private String year;

    @OneToOne
    @JoinColumn(referencedColumnName = "studentId", name = "student_id")
    private Student student;
}
