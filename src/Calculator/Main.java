package Calculator;

import java.lang.reflect.*;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Constructor<Calculator> constructor = Calculator.class.getDeclaredConstructor(int.class);
        constructor.setAccessible(true);

        Calculator calculator = constructor.newInstance(8);

        Method method = Calculator.class.getDeclaredMethod("add", int.class);

        method.setAccessible(true);

        Object result = method.invoke(calculator, 8);
        System.out.println("Result: " + result);

    }
}
