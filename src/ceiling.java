public class ceiling {
    private String style;
    private String name;

    public ceiling(String style, String name) {
        this.style = style;
        this.name = name;
    }


    public void ceiling(){
        System.out.println("your ceiling was made . " + "style :" + style + "name :"+ name );

    }


    public String getStyle() {
        return style;
    }

    public String getName() {
        return name;
    }
}
