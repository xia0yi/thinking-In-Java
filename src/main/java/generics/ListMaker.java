//: generics/ListMaker.java
package generics; /* Added by Eclipse.py */

import java.util.ArrayList;
import java.util.List;

public class ListMaker<T> {
    List<T> create() {
        return new ArrayList<T>();
    }

    public static void main(String[] args) {
        ListMaker<String> stringMaker = new ListMaker<String>();
        List<String> stringList = stringMaker.create();
    }
} ///:~
