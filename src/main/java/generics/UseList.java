//: generics/UseList.java
package generics; /* Added by Eclipse.py */
// {CompileTimeError} (Won't compile)

import java.util.List;

public class UseList<W, T> {
    //  void f(List<T> v) {}
    void f(List<W> v) {
    }
} ///:~
