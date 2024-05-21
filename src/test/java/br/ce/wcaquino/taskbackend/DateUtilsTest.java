package br.ce.wcaquino.taskbackend;

import static org.junit.jupiter.api.Assertions.assertFalse;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.ce.wcaquino.taskbackend.utils.DateUtils;

public class DateUtilsTest {
    
    @Test
    public void isBefore(){
        LocalDate before = LocalDate.of(2000, 1, 1);
        boolean result = DateUtils.isEqualOrFutureDate(before);
        assertFalse(result);
    }
}
