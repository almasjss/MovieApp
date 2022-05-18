 package com.almasjss.TestTask.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name="users")
@Getter
@Setter
@NoArgsConstructor
 public class User extends Info {
     //на входе: логин, пароль, подтверждение пароля, ФИО, ссылка на аватар
     private String login;
     private String fullName;
     private String password;
     private String rPassword;
     private String linkToAvatar;

     @OneToMany
     private List<Order> order;

     public User(String login, String fullName, String password,String rPassword,String linkToAvatar) {
         this.login = login;
         this.fullName = fullName;
         this.password = password;
         this.rPassword = rPassword;
         this.linkToAvatar=linkToAvatar;
     }
 }