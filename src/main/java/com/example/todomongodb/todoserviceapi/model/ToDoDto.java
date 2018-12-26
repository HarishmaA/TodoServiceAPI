package com.example.todomongodb.todoserviceapi.model;

import java.time.OffsetDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ToDoDto {	
	String toDoText;
	String day;
	String userId;
	OffsetDateTime createdAt;
	OffsetDateTime updatedAt;
}
