package identifiers.second;

import identifiers.first.Parent;

//klasa potomna w innej paczce nie ma dostępu do pól/metod private oraz default czyli bez identyfikatora

public class Child extends Parent {
    public void testIdentifier() {
        System.out.println(first);
        System.out.println(third);
        firstMethod();
        thirdMethod();
    }
}
