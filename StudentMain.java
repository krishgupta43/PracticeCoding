package Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import Consumer.Student;

public class StudentMain {
	
//	3 default method
//	1. and 2.or 3 negate
//	
//	2 static 
//	1 not 2. isEqual
	
	public static void main(String[] args) {
		List<Student>li=new ArrayList<>();
		li.add(new Student(1,"krishna","mumbai"));
		li.add(new Student(3,"mohan","bhopal"));
		li.add(new Student(4,"rajesh","mumbai"));
		li.add(new Student(5,"kk","indore"));
		li.add(new Student(6,"sohan","pune"));
		
		Predicate<Student> isFromMumbai=st->st.getCity().equals("mumbai");
		Predicate<Student>  isIdgreterThan3= st->st.getId()>2;
		Predicate<Student>  isNotFromMumbai= Predicate.not(isFromMumbai);
		
		
		List<Student>res_1=li.stream().filter(isFromMumbai).collect(Collectors.toList());
        List<Student>res_2=li.stream().filter(isFromMumbai.and(isIdgreterThan3)).collect(Collectors.toList());
        List<Student>res_3=li.stream().filter(isFromMumbai.negate()).collect(Collectors.toList());
        List<Student>res_4=li.stream().filter(isFromMumbai.negate()).collect(Collectors.toList());

        
		
        System.out.println(res_1);
        System.out.println(res_2);
		System.out.println(res_3);
		System.out.println(res_4);

		
	}

}
