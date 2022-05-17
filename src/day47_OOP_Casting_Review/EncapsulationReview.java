package day47_OOP_Casting_Review;

public class EncapsulationReview {
    public static int getPage() {
        return page;
    }

    public static void setPage(int page) {
        EncapsulationReview.page = page;
    }

    private static int page;

        private  String bookTitle;

        private final String publishDate;  // we cannot generate setter for final data

    public EncapsulationReview(String bookTitle, String publishDate) {
        setBookTitle(bookTitle);
        this.publishDate = publishDate;
    }

    public void setBookTitle(String bookTitle) {
        if (bookTitle == null || bookTitle.isEmpty()) {
            throw  new RuntimeException("Invalid Data");
        }
        this.bookTitle = bookTitle;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getPublishDate() {
        return publishDate;
    }


}

