package tags;

import composite.HTMLRenderer;

public class P extends Tag {
    private String openTag = "\n<p>\n";
    private String closeTag = "\n</p>\n";
    public P(String content) {
        super(content);
    }

    public P() {
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
