import tk.vantis.Domain;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        Domain domain = new Domain();
        System.out.println(Arrays.stream(domain.getClass().getAnnotations()).map(annotation -> annotation.annotationType().getCanonicalName()).collect(Collectors.joining(",")));
    }
}
