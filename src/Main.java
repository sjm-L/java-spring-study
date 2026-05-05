public class Main {
    public static void main(String[] args) {
        Book book = new Book("자바 입문", 15000);
        book.printInfo();
    }
}
class Book {
    String title;
    int price;

    Book(String title, int price){
        this.title = title;
        this.price = price;
    }
    void printInfo(){
        System.out.println(title + "책의 가격은 " + price + "입니다.");
    }
}