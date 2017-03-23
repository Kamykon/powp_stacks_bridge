package edu.kis.vh.stacks.list;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

public class StackListTest {

    final private int ANY_VALUE = 12;

    @Test
    public void shouldPushElement() throws Exception {
        //given:
        final StackList stackList = new StackList();

        //when:
        stackList.push(12);

        //then:
        assertThat(stackList.top(),is(ANY_VALUE));
    }

    @Test
    public void shouldBeEmpty() throws Exception {
        //given
        final StackList stackList = new StackList();

        //when:
        Boolean result = stackList.isEmpty();

        //then:
        assertThat(result,is(true));
    }

    @Test
    public void shouldReturnNegativeNumberWhenStackIsEmpty() throws Exception {
        //given:
        final int EXPECTED_NEGATIVE_VALUE = -1;
        final StackList stackList = new StackList();

        //when:
        int result = stackList.top();

        //then:
        assertThat(result,is(EXPECTED_NEGATIVE_VALUE));
    }

    @Test
    public void shouldReturnValueOfPeek() throws Exception {
        //given:
        final StackList stackList = new StackList();
        stackList.push(ANY_VALUE);

        //when:
        int result = stackList.top();

        //then:
        assertThat(result,is(ANY_VALUE));
    }

    @Test
    public void shouldPopElement() throws Exception {
        //given:
        final StackList stackList = new StackList();
        stackList.push(ANY_VALUE);

        //when:
        int result = stackList.pop();

        //then:
        assertThat(result, is(ANY_VALUE));
    }

    @Test
    public void shouldStackBeEmptyAfterPop() throws Exception {
        //given:
        final StackList stackList = new StackList();
        stackList.push(ANY_VALUE);

        //when:
        stackList.pop();

        //then:
        assertThat(stackList.isEmpty(),is(true));
    }
}