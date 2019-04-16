package Objects;

public class BlogPost {

    String authorname;
    String title;
    String text;
    String publicationDate;

    public BlogPost(String authorname, String title, String text, String publicationDate) {

        this.authorname = authorname;
        this.title = title;
        this.text = text;
        this.publicationDate = publicationDate;

    }

    public String samples() {
        String firstSample = authorname+title+text+publicationDate;
        return firstSample;
    }

}


