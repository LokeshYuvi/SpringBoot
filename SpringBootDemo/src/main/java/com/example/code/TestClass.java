package com.example.code;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;


public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  List<Integer> list= new ArrayList<>();
		  
		  for (int i=0;i<10;i++)
		  {
			  list.add(i);
		  }

		  list.forEach(System.out::println);
		  
		  Stream<Integer> stream= list.stream();
		  
		  list.stream().filter(p->p.toString().startsWith("1")).forEach(System.out::println);
			
		}
	}


