import java.lang.reflect.Method;

class MethodFinder {

    public static String findMethod(String methodName, String[] classNames) throws ClassNotFoundException {
        for (String s : classNames) {
            final Class<?> aClass = Class.forName(s);
            Method[] methods = aClass.getMethods();
            for (Method m : methods) {
                if (m.getName().equals(methodName)) {
                    return aClass.getName();
                }
            }
        }
        return "Not found";
    }
}