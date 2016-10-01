package com.yz.utils;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.yz.vo.UploadResult;

public class TestMain {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		UploadResult uploadResult = new UploadResult();

		uploadResult.setUploadResult(1);
		
		// 得到类对象
		Class userCla = (Class) uploadResult.getClass();

		/*
		 * 得到类中的所有属性集合
		 */
		Field[] fs = userCla.getDeclaredFields();
		for (int i = 0; i < fs.length; i++) {
			Field f = fs[i];
			f.setAccessible(true); // 设置些属性是可以访问的
			String paramName = f.getName();

			String methodName = "get";

			String letter = paramName.substring(0, 1).toUpperCase();

			methodName = methodName + letter + paramName.substring(1);
			
			System.out.println("paramName:" + f.getName());
			System.out.println("methodName:" + methodName);

			Method method = userCla.getMethod(methodName,null);
			
			
			System.out.println( method.invoke(userCla, null));

		}

		/*
		 * 得到类中的方法
		 */
		Method[] methods = userCla.getMethods();
		for (int i = 0; i < methods.length; i++) {
			Method method = methods[i];
			if (method.getName().startsWith("get")) {
			}
		}
	}

}
