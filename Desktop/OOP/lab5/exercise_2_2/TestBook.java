package exercise_2_2;

public class TestBook {
    public static void main(String[] args){
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@nowhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');

        Book javaDummy = new Book("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy);
    }
}
//Book[name='Java for Dummy, authors={Author[name=[Author[name=Tan Ah Teckemail=AhTeck@nowhere.comgender=m], Author[name=Paul Tanemail=Paul@nowhere.comgender=m]], price=19.99, qty=99}

