package com.cys.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.cys.pojo.Student;

public class Mytest {
	public static void main(String[] args) {
		//System.out.println(getFiftyStudent());
		List<Student> student = getFiftyStudent();
			List<Student> list1 = findMatchPerson(student,p->p.getScore()==65);
			for(Student stu:list1) {
				System.out.println(stu);
			}
			System.out.println("======65=======");
			List<Student> list2 = findMatchPerson(student,p->p.getScore()==70);
			for(Student stu:list2) {
				System.out.println(stu);
			}
			System.out.println("======70=======");
			List<Student> list3 = findMatchPerson(student,p->p.getScore()==75);
			for(Student stu:list3) {
				System.out.println(stu);
			}
			System.out.println("======75=======");
			List<Student> list4 = findMatchPerson(student,p->p.getScore()==80);
			for(Student stu:list4) {
				System.out.println(stu);
			}
			System.out.println("=======80======");
			List<Student> list5 = findMatchPerson(student,p->p.getScore()==85);
			for(Student stu:list5) {
				System.out.println(stu);
			}
			System.out.println("=======85======");
			List<Student> list6 = findMatchPerson(student,p->p.getScore()==90);
			for(Student stu:list6) {
				System.out.println(stu);
			}
			System.out.println("======90=======");
			List<Student> list7 = findMatchPerson(student,p->p.getScore()==95);
			for(Student stu:list7) {
				System.out.println(stu);
			}
			System.out.println("======95=======");
			List<Student> list8 = findMatchPerson(student,p->p.getScore()==100);
			for(Student stu:list8) {
				System.out.println(stu);
			}
			System.out.println("======100=======");
			
			
		
	}
	/**
	 * 获取50个学生的成绩
	 * */
	public static List<Student> getFiftyStudent(){
		List<Student> list = new ArrayList<>();
		List<Integer> inte = new ArrayList<>();
		for(int i = 0;i < 8;i++) {
			inte.add(65+i*5);
		}
		Random ran = new Random();
		for(int i = 0;i < 50;i++) {
			Student s = new Student();
			s.setId(i+1);
			s.setName("Tom"+(i+1));
			s.setScore(inte.get(ran.nextInt(8)));
			list.add(s);
		}
		return list;
	}
	
	public static List<Student> findMatchPerson(List<Student> student,Predicate<Student> p){
		return student.stream().filter(p).collect(Collectors.toList());
	}

}
