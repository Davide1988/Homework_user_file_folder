package com.example.UserHomework.models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name= "folders")
public class Folder {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name= "name")
    private String name;

    @JsonIgnore
    @OneToMany(mappedBy = "folder")
    private List<File> files;

    @ManyToOne
    @JoinColumn(name= "user_id")
    private User user;


    public Folder(String name, User user) {
        this.name = name;
        this.files = new ArrayList<>();
        this.user = user;
    }


    public Folder(){

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

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void addFile(File file){
        this.files.add(file);
    }
}
