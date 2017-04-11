package io.annotions.lib;

/**
 *  Created by shailendra.singh on 4/11/17.
 *
 *  usage - as used in code below
 *
 *  purpose - demonstrate nested java custom annotations
 *
 */

public class TestAnnotation {


    @MethodDoc(
            author = @Author(value = "Shailendra Singh"),
            desc = @ShortDesc(value = "IntelliJ has psvm shortcut to generate main() method stub"),
            type = @MethodType(value = {MethodType.Type.FUNCTIONAL, MethodType.Type.HELPER})
    )
    public static void main(String[] args) {
        System.out.println("Hello world, said Annotation!");
    }


}
