package tags;

import composite.HTMLRenderer;

public class Div extends Tag {
    private String openTag = "\n<div>\n";
    private String closeTag = "\n</div>\n";
    public Div(String content) {
        super(content);
    }

    public Div() {
        super();
    }

    @Override
    public String render() {
        StringBuilder temp = new StringBuilder();
        for (HTMLRenderer c : components) {
            temp.append(c.render());
        }
        return openTag + ((content != null) ? content : "") + temp + closeTag;
    }
}
