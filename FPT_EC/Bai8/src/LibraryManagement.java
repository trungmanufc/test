import java.util.LinkedList;
import java.util.List;

public class LibraryManagement {
    private List<Card> cardList = new LinkedList<>();

    public void addCard(Card card) {
        cardList.add(card);
    }

    public void deleteCard(String id) {
        cardList.remove(cardList.stream().filter(o-> o.getId().contains(id)).toList());
    }

    public void showCardList() {
        cardList.forEach(o -> System.out.println(o.toString()));
    }
}
