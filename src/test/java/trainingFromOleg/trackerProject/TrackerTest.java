package trainingFromOleg.trackerProject;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class TrackerTest {


    @Test
    /**
     * тест должен проверять добавление заявки
     */
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1","testDescription","123");
        tracker.add(item);
        assertThat(tracker.findById("123"), is(item));
    }

    @Test
    /**
     * Тест для метода replace (редактирование заявки  )
     */
    public void whenReplaceNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1","testDescription","123");
// Добавляем заявку в трекер. Теперь в объект проинициализирован id.
        tracker.add(previous);
// Создаем новую заявку.
        Item next = new Item("test2","testDescription2","1234");
// Проставляем старый id из previous, который был сгенерирован выше.
        next.setId(previous.getId());
// Обновляем заявку в трекере./
        tracker.replace(previous.getId(), next);
// Проверяем, что заявка с таким id имеет новые имя test2.
        assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
    }

    @Test
    /**
     * тест должен проверять добавление заявки
     */
    public void deletemetodTest() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1","testDescription","123");
        Item item2 = new Item("test2","testDescription","1234");
        Item item3 = new Item("test3","testDescription","12356");

        tracker.add(item);
        tracker.add(item2);
        tracker.add(item3);

        tracker.delete("1234");
        tracker.delete("12356");
        assertThat(tracker.findById("123"), is(item));
    }


}