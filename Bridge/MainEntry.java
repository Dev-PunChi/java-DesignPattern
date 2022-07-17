package Bridge;

public class MainEntry {
    public static void main(String[] args) {
        var title = "브릿지 패턴";
        var author = "PunChi";
        String[] content = {
            "패턴 테스트 내용",
            "var 키워드 안되는구나",
            "껄껄껄"
        };

        Draft draft = new Draft(title, author, content);
        //draft.print(new SimpleDisplay());
        draft.print(new CaptionDisplay());
        
        var publisher = "초곡출판사";
        var cost = 1_000_000;

        Publication publication = new Publication(title, author, content, publisher, cost);
        //publication.print(new SimpleDisplay());
        publication.print(new CaptionDisplay());
    }
}
