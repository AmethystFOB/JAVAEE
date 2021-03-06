package BeansManageXML;

/**
 * set方法进行注入属性
 */
public class Book {
    /*创建属性*/
    private String bookName;
    private String bookAuthor;

    //set方式注入
    /*创建属性对应的set方法*/
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public void testDemo(){
        System.out.println("BookName:"+bookName+"\n"+"BookAuthor:"+bookAuthor);
    }
//
//    //有参数构造注入
//    public Book(String bookName) {
//        this.bookName = bookName;
//    }
//
//    public static void main(String[] args) {
////        Book book = new Book();
////        book.setBookName("Effective JAVA");
//        Book effective_java = new Book("Effective JAVA");
//    }
}
