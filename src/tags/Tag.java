package tags;

import composite.Composite;
import composite.HTMLRenderer;

public abstract class Tag extends Composite implements HTMLRenderer {
    protected String content;

    public Tag(String content) {
        this.content = content;
    }
    public Tag() {

    }

    @Override
    abstract public String render();
}
