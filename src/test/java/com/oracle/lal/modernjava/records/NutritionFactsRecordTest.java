package com.oracle.lal.modernjava.records;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NutritionFactsRecordTest {
    @Test
    public void recordsPlayground() {

        var nutritionFactsRecord = new NutritionFactsRecord(0L, 0L, 3, 100);
        assertEquals(0L, nutritionFactsRecord.fat());

        assertEquals(NutritionFactsRecord.of(0L, 0L, 0, 0), NutritionFactsRecord.ZERO);
        assertEquals("""
                        NutritionFactsRecord[calories=0, fat=0, sodium=3, carbohydrates=100]""",
                nutritionFactsRecord.toString());
    }

}