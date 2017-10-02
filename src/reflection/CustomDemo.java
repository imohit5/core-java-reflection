package reflection;

import java.lang.annotation.ElementType;
import java.lang.annotation.ElementType.*;
import java.lang.annotation.Retention;import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = { ElementType.METHOD, ElementType.TYPE })
public @interface CustomDemo {
	
	public String value1();
	public String value2();

}
