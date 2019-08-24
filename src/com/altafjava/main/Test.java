package com.altafjava.main;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import com.altafjava.classloader.AltafClassLoader;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException,
			IllegalArgumentException, InvocationTargetException {

		AltafClassLoader altafClassLoader = new AltafClassLoader();
		Class<?> studentClass = altafClassLoader.findClass("com.altafjava.model.Student");
		Object object = studentClass.newInstance();
		Method method = studentClass.getMethod("getStudentName");
		String studentName = (String) method.invoke(object);
		System.out.println("Student Name = " + studentName);
		System.out.println("AltafClassLoader class is loaded by : " + altafClassLoader.getClass().getClassLoader());
		System.out.println("Student class is loaded by : " + studentClass.getClassLoader());

	}
}
