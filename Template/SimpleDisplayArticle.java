package Template;

public class SimpleDisplayArticle extends DisplayArticleTemplate {

    public SimpleDisplayArticle(Article article) {
        super(article);
    }

    @Override
    protected void title() {
        System.out.println(article.getTitle());
        
    }

    @Override
    protected void content() {
        var content = article.getContent();
        for (String string : content) {
            System.out.println(string);
        }        
    }

    @Override
    protected void footer() {
        System.out.println(article.getFooter());        
    }    
}
