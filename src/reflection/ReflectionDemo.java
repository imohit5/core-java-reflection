package reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionDemo {

	public static void main(String[] args) {
		
		try {
			Class<?> forName = Class.forName(TwoNumbers.class.getName());
			System.out.println(forName.getName());
			
			Constructor<?>[] constructors = forName.getConstructors();
			System.out.println(constructors);
			System.out.println(Arrays.toString(constructors));
			for (Constructor<?> constructor : constructors) {
				System.out.println(constructor);
			}
			
			Method[] methods = forName.getMethods();
			System.out.println(methods);
			System.out.println(Arrays.toString(methods));
			for (Method method : methods) {
				System.out.println(method);
			}
			
			Constructor<?> constructor = forName.getConstructor(null);
			Object newInstance = constructor.newInstance(null);
			System.out.println(newInstance);
			
			Constructor<?> constructor2 = forName.getConstructor(Double.class, Double.class);
			Object newInstance2 = constructor2.newInstance(5D,10D);
			System.out.println(newInstance2);
			
			Method method = forName.getMethod("getNum1", null);
			Object invoke = method.invoke(newInstance2, null);
			System.out.println(invoke);
			
			Method method2 = forName.getMethod("getNum2", null);
			Object invoke2 = method2.invoke(newInstance2, null);
			System.out.println(invoke2);
			
			Method method3 = forName.getMethod("setNum1", Double.class);
			Object invoke3 = method3.invoke(newInstance2, 15D);
			System.out.println(invoke3);
			
			Method method4 = forName.getMethod("setNum2", Double.class);
			Object invoke4 = method4.invoke(newInstance2, 15D);
			System.out.println(invoke4);
			
			Method method5 = forName.getMethod("getNum1", null);
			Object invoke5 = method5.invoke(newInstance2, null);
			System.out.println(invoke5);
			
			Method method6 = forName.getMethod("getNum2", null);
			Object invoke6 = method6.invoke(newInstance2, null);
			System.out.println(invoke6);
			
			Method method7 = forName.getMethod("sum", Double.class, Double.class);
			Object invoke7 = method7.invoke(newInstance2, 25D, 25D);
			System.out.println(invoke7);
			
			Field declaredField = forName.getDeclaredField("num1");
			declaredField.setAccessible(true);
			declaredField.set(newInstance2, 60D);
			
			Field declaredField2 = forName.getDeclaredField("num2");
			declaredField2.setAccessible(true);
			declaredField2.set(newInstance2, 60D);
			
			Method method8 = forName.getMethod("getNum1", null);
			Object invoke8 = method8.invoke(newInstance2, null);
			System.out.println(invoke8);
			
			Method method9 = forName.getMethod("getNum2", null);
			Object invoke9 = method9.invoke(newInstance2, null);
			System.out.println(invoke9);
			
			Annotation[] annotations = forName.getAnnotations();
			System.out.println(annotations);
			System.out.println(Arrays.toString(annotations));
			for (Annotation annotation : annotations) {
				System.out.println(annotation);
			}
			CustomDemo annotation = (CustomDemo) annotations[0];
			String value1 = annotation.value1();
			String value2 = annotation.value2();
			System.out.println(value1);
			System.out.println(value2);
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		}
		
	}

}
