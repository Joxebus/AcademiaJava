/**
* @author: Jorge Omar Bautista Valenzuela
* Date: 22/05/2012
* e-mail: joxebus@gmail.com
*
*/

import java.lang.reflect.Field;

public class CopyProperties<T> {

	/**
	*
	* Este método recibe un objeto de cualquier clase
	* y recibe un objeto vacío del mismo tipo
	* llena los valores de nuevo con los del fuente
	* @source (Objeto origen)
	* @target (Objeto destino)
	*
	*/
	public T copyFields(T source, T target) {
		try{
			Class clazz = source.getClass();
			for (Field field : clazz.getDeclaredFields()) {
                            field.setAccessible(true);
			    Object value = field.get(source);
			    field.set(target, value);
			}
		}catch(IllegalAccessException iae){
			System.out.println("No se pudo tener acceso a una propiedad");			
		}
		return target;
	}
}
