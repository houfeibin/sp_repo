package com.tedu.sp01.pojo;

 

import java.util.ArrayList;

import java.util.List;

 

import lombok.AllArgsConstructor;

import lombok.Data;

import lombok.NoArgsConstructor;

 

@Data

@NoArgsConstructor

@AllArgsConstructor

public class Order {

      private String id;

      private User user;

<<<<<<< HEAD
      private List<Item> items;//312
=======
      private List<Item> items;
>>>>>>> branch 'master' of https://github.com/houfeibin/sp_repo.git

}
