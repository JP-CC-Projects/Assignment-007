import com.coderscampus.arraylist.CustomArrayList;
import com.coderscampus.arraylist.CustomList;
import org.junit.jupiter.api.Test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static org.junit.jupiter.api.Assertions.*;


public class CustomArrayListTest {
    @Test
    void get_should_return_null_if_nothing_added(){
        CustomList<Integer> customList = new CustomArrayList<Integer>();
        assertNull(customList.get(0));
        assertNull(customList.get(1));
        assertNull(customList.get(2));
        CustomList<Integer> sut = new CustomArrayList<>();
        for (int i = 0; i < 10; i++){
            sut.add(i);
        }
        sut.remove(9);
        sut.remove(7);
        sut.add(7, 1000);
        sut.add(7, 1001);
        sut.add(7, 1002);
        sut.add(2000);

    }

    @Test
    void getSize_should_return_0_if_nothing_added(){
        CustomList<Integer> customList = new CustomArrayList<Integer>();
        assertEquals(0, customList.getSize());
    }

    @Test
    void should_return_true_when_successfully_adding_item(){
        CustomList<Integer> customList = new CustomArrayList<Integer>();
        assertTrue(customList.add(20));
    }
    @Test
    void should_return_true_when_successfully_adding_index_item_to_exsting_array(){
        CustomList<Integer> customList = new CustomArrayList<Integer>();
        customList.add(0);
        customList.add(1);
        customList.add(2);
        customList.add(3);
        assertTrue(customList.add(2, 20));
    }

    @Test
    void should_add_one_item_to_custom_arraylist(){
        CustomList<Integer> customList = new CustomArrayList<Integer>();
        customList.add(1);
        assertEquals(1, customList.get(0));
    }

    void should_add_one_item_to_custom_arraylist_at_index_0(){
        CustomList<Integer> customList = new CustomArrayList<Integer>();
        customList.add(0, 1);
        assertEquals(1, customList.get(0));
        assertNull(customList.get(1));
    }
    @Test
    void should_have_null_array_after_adding_and_removing_one_int(){
        CustomList<Integer> customList = new CustomArrayList<Integer>();
        customList.add(1);
        customList.remove(0);
        assertNull(customList.get(0));
    }

    @Test
    void should_return_false_if_adding_to_nonexisting_index(){
        CustomList<Integer> customList = new CustomArrayList<Integer>();
        assertFalse(customList.add(2, 2));
    }

    @Test
    void should_have_zero_sized_array_after_adding_and_removing_30_ints(){
        CustomList<Integer> customList = new CustomArrayList<Integer>();
        for(int i = 0; i < 30; i++){
            customList.add(i, i);
        }
        for(int i = 0; i < 30; i++){
            customList.remove(0);
        }
        assertEquals(0, customList.getSize());
    }
    @Test
    void should_add_one_million_ints (){
        CustomList<Integer> customListAddInts = new CustomArrayList<Integer>();
        for(int i = 0; i < 1000000; i++){
            customListAddInts.add(i);
        }
        assertEquals(1000000, customListAddInts.getSize());
    }
}
