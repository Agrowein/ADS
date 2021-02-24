import tags.Div;
import tags.P;
import tags.Span;

public class MainApp {
    public static void main(String[] args) {
        Div div1 = new Div();
        div1.addComponent(new Div("Привет"));
        div1.addComponent(new Div("Миру!"));

        Div div2 = new Div();
        div2.addComponent(div1);
        div2.addComponent(new Span("lorem10"));
        div1.addComponent(new P("Какой-то текст непонятный, сам набрал, не знаю как в голову такое пришло, \n но есть что есть. Посмотрим на тег параграфа"));

        System.out.println(div2.render());
    }
}
