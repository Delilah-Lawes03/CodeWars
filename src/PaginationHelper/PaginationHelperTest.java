import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PaginationHelperTest {

        @org.junit.jupiter.api.Test
        void itemCount() {
            PaginationHelper<Character> helper = new PaginationHelper<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
            assertEquals(6, helper.itemCount());
        }

        @org.junit.jupiter.api.Test
        void pageCount() {
            PaginationHelper<Character> helper = new PaginationHelper<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
            assertEquals(2, helper.pageCount());
        }

        @org.junit.jupiter.api.Test
        void pageItemCount() {
            PaginationHelper<Character> helper = new PaginationHelper<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
            assertEquals(4, helper.pageItemCount(0));
            assertEquals(2, helper.pageItemCount(1));
            assertEquals(-1, helper.pageItemCount(2));
        }

        @org.junit.jupiter.api.Test
        void pageIndex() {
            PaginationHelper<Character> helper = new PaginationHelper<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
            assertEquals(1, helper.pageIndex(5));
            assertEquals(0, helper.pageIndex(2));
            assertEquals(-1, helper.pageIndex(20));
            assertEquals(-1, helper.pageIndex(-10));
        }

}