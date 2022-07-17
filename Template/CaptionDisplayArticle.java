package Template;

public class CaptionDisplayArticle extends DisplayArticleTemplate {

    public CaptionDisplayArticle(Article article) {
        super(article);
    }

    @Override
    protected void title() {
        System.out.println("TITLE : " + article.getTitle());
        
    }

    @Override
    protected void content() {
        System.out.println("CONTENT : ");
        var content = article.getContent();
        for (String string : content) {
            System.out.println("    " + string);
        }        
    }

    @Override
    protected void footer() {
        System.out.println("FOOTER : " + article.getFooter());
    }    
}
