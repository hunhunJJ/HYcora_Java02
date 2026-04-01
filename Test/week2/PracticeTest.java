package week2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PracticeTest {

    // =========================
    // TODO 1 테스트
    // =========================

    @Test
    void java를_포함하고_길이가_5이상이면_true() {
        assertTrue(Practice.checkJavaText("i love java"));
    }

    @Test
    void 길이가_5미만이면_false() {
        assertFalse(Practice.checkJavaText("java"));
    }

    @Test
    void java를_포함하지_않으면_false() {
        assertFalse(Practice.checkJavaText("python"));
    }

    @Test
    void 대소문자_구분_확인() {
        assertFalse(Practice.checkJavaText("I LOVE JAVA"));
    }

    // =========================
    // TODO 2 테스트
    // =========================

    @Test
    void 짝수들의_합을_구한다() {
        assertEquals(6, Practice.sumEvenNumbers(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void 짝수가_없는_경우() {
        assertEquals(0, Practice.sumEvenNumbers(new int[]{7, 9, 11}));
    }

    @Test
    void 모든_값이_짝수인_경우() {
        assertEquals(12, Practice.sumEvenNumbers(new int[]{2, 4, 6}));
    }

    // =========================
    // TODO 3 테스트
    // =========================

    @Test
    void 가장_긴_문자열을_반환한다() {
        assertEquals("banana", Practice.getLongestWord(
                new String[]{"hi", "banana", "cat"}));
    }

    @Test
    void 길이가_같은_경우_앞의_값을_반환한다() {
        assertEquals("apple", Practice.getLongestWord(
                new String[]{"apple", "grape"}));
    }

    @Test
    void 한개의_요소만_있는_경우() {
        assertEquals("java", Practice.getLongestWord(
                new String[]{"java"}));
    }

}
