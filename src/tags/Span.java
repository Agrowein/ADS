package tags;

import composite.HTMLRenderer;

public class Span extends Tag {
    private String openTag = "\n<span>\n";
    private String closeTag = "\n</span>\n";
    public Span(String content) {
        super(content);
    }

    public Span() {
        super();
    }

    @Override
    public String render() {
        StringBuilder temp = new StringBuilder();
        for (HTMLRenderer c : components) {
            temp.append(c.render());
            temp.append( "\n");
        }
        return openTag + ((content != null) ? content : "") + temp + closeTag;
    }
}
