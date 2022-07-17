package Template;

import java.util.ArrayList;

public class MainEntry {
    public static void main(String[] args) {
        String title = "Template 패턴";
        ArrayList<String> content = new ArrayList<>();
        content.add("이해하고 넘어가야한다!!");
        content.add("디자인 패턴은 쉽다!!");
        content.add("진짜로 쉬울까.......");
        String footer = "2022.05.15 PunChi";

        Article article = new Article(title, content, footer);
        SimpleDisplayArticle style_1 = new SimpleDisplayArticle(article);
        System.out.println("[CASE-1]");
        style_1.display();

        CaptionDisplayArticle style_2 = new CaptionDisplayArticle(article);
        System.out.println("[CASE-2]");
        style_2.display();
    }
}
