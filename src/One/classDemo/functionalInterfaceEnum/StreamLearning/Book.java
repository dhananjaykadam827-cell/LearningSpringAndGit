package One.classDemo.functionalInterfaceEnum.StreamLearning;

public class Book {
    String title;
    int publicationDate;
    double price;
    String category;

    Book(String title, int publicationDate,double price,String category){
        this.title = title;
        this.publicationDate = publicationDate;
        this.price = price;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Book{" +
                "category='" + category + '\'' +
                ", title='" + title + '\'' +
                ", publicationDate=" + publicationDate +
                ", price=" + price +
                '}';
    }
}
