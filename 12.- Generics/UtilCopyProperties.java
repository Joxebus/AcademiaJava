import java.lang.reflect.Field;

public class UtilCopyProperties<T> {
    public T copyFields(T target, T source) {
        try {
            Class<?> clazz = source.getClass();
            for (Field field : clazz.getDeclaredFields()) {
                field.setAccessible(true);
                Object value = field.get(source);
                field.set(target, value);
            }
        } catch (IllegalAccessException iae) {
            System.out.println("No se pudo tener acceso a una propiedad");
        }
        return target;
    }
}
