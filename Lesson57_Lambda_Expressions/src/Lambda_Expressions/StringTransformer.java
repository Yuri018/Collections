package Lambda_Expressions;

import java.util.function.*;

@FunctionalInterface
public interface StringTransformer<T> {
    T transform(T str);



}
