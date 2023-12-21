class library{
    String book[];
    int no_of_book=0;


    library(){
        this.book = new String[100];
        this.no_of_book = 0;
    }


    void add_book(String book){
        this.book[no_of_book] = book;
        no_of_book++;
        System.out.println("Book successfully added.");
    }


    void available_book(){
        System.out.println("Available books are : ");
        for(int i = 0;i < book.length;i++){
            if(this.book[i] == null){
                continue;
            }
            else{
                System.out.println(book[i]);
            }
        }
    }

    void issue_book(String book){
        for(int i = 0; i < this.book.length;i++){
            if(this.book[i] == book){
                System.out.println("This book has been issued");
                this.book[i] = null;
                return;
            }
        }
        System.out.println("The book does not exist");
    }

    void return_book(String book){
        add_book(book);
    }
}

public class ep12 {
    public static void main(String[] args) {
        library l = new library();
        l.add_book("DSA");
        l.add_book("C++");
        l.add_book("MySQL");
        l.add_book("java");
        l.available_book();
        l.issue_book("java");
        l.available_book();
        l.return_book("java");
        l.available_book();
    }
}
