package AutoCall;

import AutoCall.Annotations.AutoCall;

import java.lang.reflect.Method;

public class NyKlass {

    public void callTelefonMethods() {
        Telefon telefon = new Telefon();

        for (Method method : telefon.getClass().getDeclaredMethods()) {
            AutoCall annotation = method.getAnnotation(AutoCall.class);
            if (annotation != null && method.getParameterCount() == 0) {
                System.out.println("Annotation message: " + annotation.message());
                try {
                    method.setAccessible(true);
                    method.invoke(telefon);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}