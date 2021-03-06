package com.desklampstudios.edab;

import java.util.List;

import com.googlecode.objectify.Ref;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;
import com.googlecode.objectify.annotation.Load;

@Entity
public class Course {
	@Id Long id;
	@Index String name;
	String longName;
	// String fcps_id;
	String bb_id;
	// String bb_long_id;
	@Load @Index List<Ref<User>> instructors;
	// @Load @Index Ref<Semester> semester;
}
