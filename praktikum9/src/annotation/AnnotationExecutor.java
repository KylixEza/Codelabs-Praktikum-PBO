package annotation;

import java.lang.reflect.Field;

public class AnnotationExecutor {

    public void nullableCheck(Object object) throws Exception {
        Class<?> clazz = object.getClass();
        for(Field field: clazz.getDeclaredFields()) {
            field.setAccessible(true);
            if(clazz.isAnnotationPresent(FieldNotNull.class)) {
                if (field.get(this) == null) {
                    throw new NullPointerException("Field must not be null");
                }
            }
        }
    }

}
