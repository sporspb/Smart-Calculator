import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Get sorted list of private fields the object declares (inherited fields should be skipped).
 */
class FieldGetter {

    public List<String> getPrivateFields(Object object) {
        Field[] fields = object.getClass().getDeclaredFields();
        List<String> publicFields = new ArrayList<>();
        for (Field field : fields) {
            int modifiers = field.getModifiers();
            if (Modifier.isPrivate(modifiers)) {
                publicFields.add(field.getName());
            }
        }
        Collections.sort(publicFields);
        return publicFields;
    }
}