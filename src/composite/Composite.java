package composite;

import java.util.ArrayList;
import java.util.List;

public abstract class Composite implements HTMLRenderer {
    protected final List<HTMLRenderer> components = new ArrayList<>();

    public void addComponent(HTMLRenderer component) {
        components.add(component);
    }
    public void removeComponent(HTMLRenderer component) {
        components.remove(component);
    }

    @Override
    abstract public String render();
}
