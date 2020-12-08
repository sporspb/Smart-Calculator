import java.util.stream.Stream;

/**
 * Check whether the class declares public parameterless constructor
 */
class ConstructorChecker {

    public boolean checkPublicParameterlessConstructor(Class<?> clazz) {
        return Stream
                .of(clazz.getConstructors())
                .anyMatch(constructor -> constructor.getParameterTypes().length == 0);
    }
}