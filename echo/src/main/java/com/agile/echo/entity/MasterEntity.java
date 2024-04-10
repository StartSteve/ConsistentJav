package com.agile.echo.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "master")
@Data
public class MasterEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "master_seq")
    @SequenceGenerator(name = "master_seq", sequenceName = "master_seq")
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name="created_at",updatable = false)
    @CreationTimestamp
    private LocalDateTime createdAt;
    @UpdateTimestamp
    @Column(name = "modified_at")
    private LocalDateTime modifiedAt;

}
