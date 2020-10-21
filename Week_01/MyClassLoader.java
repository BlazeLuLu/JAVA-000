import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.net.URISyntaxException;

public class MyClassLoader extends ClassLoader {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class<?> hello = new MyClassLoader().findClass("Hello");
        Object instance = hello.newInstance();
        Method method = hello.getMethod("hello");
        method.invoke(instance);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        byte[] Bytes = null;
        try {
            Bytes = Files.readAllBytes(Paths.get(new URI("file:///Users/luyue/Documents/GeekTimeCamp/Java/homework/week1/Hello.xlass")));
            for (int i = 0; i < Bytes.length; i++) {
                Bytes[i] = (byte) (255 - Bytes[i]);
            }
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
        return defineClass(name, Bytes, 0, Bytes.length);
    }
}