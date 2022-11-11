import java.time.LocalDate;

public class Card {
    private Student student;
    private String id;
    private LocalDate borrowDay;
    private LocalDate giveBackDay;
    private String bookName;

    public Card(Student student, String id, LocalDate borrowDay, LocalDate giveBackDay, String bookName) {
        this.student = student;
        this.id = id;
        this.borrowDay = borrowDay;
        this.giveBackDay = giveBackDay;
        this.bookName = bookName;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getBorrowDay() {
        return borrowDay;
    }

    public void setBorrowDay(LocalDate borrowDay) {
        this.borrowDay = borrowDay;
    }

    public LocalDate getGiveBackDay() {
        return giveBackDay;
    }

    public void setGiveBackDay(LocalDate giveBackDay) {
        this.giveBackDay = giveBackDay;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "Card{" +
                "student=" + student +
                ", id='" + id + '\'' +
                ", borrowDay=" + borrowDay +
                ", giveBackDay=" + giveBackDay +
                ", bookName='" + bookName + '\'' +
                '}';
    }
}
