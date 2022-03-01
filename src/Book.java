import java.util.*;
class Book {

    public static void main(String[] args) {
        List <BookDetails> book = new ArrayList<>();
        List <BookingDetails> bookings = new ArrayList<>();
        book.add(new BookDetails("Python","Tharun",2020,3,true));
        book.add(new BookDetails("C++","Gowtham",1980,0,false));
        book.add(new BookDetails("Java","Giri Babu",2000,2,true));
        book.add(new BookDetails("Golang","Nijesh",2005,2,true));
        book.add(new BookDetails("Nodejs","Yogesh",2002,3,true));
        int useropt = 1;
        Scanner sc = new Scanner(System.in);
        for (BookDetails b : book) {
            b.BookDisplayinfo();
        }
        while (useropt == 1) {
            System.out.println("Press 1 for Booking \nPress 2 to exit");
            useropt = sc.nextInt();
            if(useropt == 1) {
                BookingDetails bk = new BookingDetails();
                for(BookDetails d : book){
                    if( d.getBookName().contains(bk.bname)){
                        if(d.getTotNoBooks()!=0){

                            int a= d.getTotNoBooks();
                            int b=d.getYearofPub();
                            bookings.add(bk);
                            d.setTotNoBooks(--a);
                            System.out.println("Your Book is Confirmed, Happy Learning\n");
                            System.out.println("Book Author is "+d.Author);
                            System.out.println("Year of Publications "+d.YearofPub);
                            System.out.println("Book Have? " +d.Available);
                            System.out.println("Book "+d.BookName+" Balance Book is "+d.getTotNoBooks());
                        }else{
                            System.out.println("Sorry Book is Full,Try Another Book ");
                        }

                    }
                    //something here
                }
            }
            if(useropt > 2 ){
                System.out.println("Invalid No");
            }

        }
    }
}
