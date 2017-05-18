package jp.co.rakuten_sec.exportfile.entity;



import java.util.Collection;
import java.util.Map;


public class EntityUtils {

	public static final Class getEntityClass(Entity entity) {
		return getClass(entity.getClass());
	}

	public static final <T extends Entity> Class getEntityClass(Class<T> classT) {
		return getClass(classT);
	}

	private static final Class getClass(Class class1) {

		if (class1 == null) {
			return null;
		}

		Class[] interfaces = class1.getInterfaces();
		for (Class interfaceClass : interfaces) {
			if (interfaceClass == Entity.class) {
				return class1;
			}
		}

		return getClass(class1.getSuperclass());
	}

	/*public static final Map toMap(Entity entity) {
		try {
			return BeanUtils.describe(entity);
		} catch (Exception e) {
			throw new SystemException(e);
		}

	}*/

	/*public static final boolean isEmpty(Entity entity) {
		Map map = toMap(entity);
		Collection<?> values = map.values();
		String className = "class " + entity.getClass().getName();
		for (Object value : values) {
			if (className.equals(value)) {
				continue;
			}
			if (value != null) {
				return false;
			}
		}
		return true;
	}*/
}
