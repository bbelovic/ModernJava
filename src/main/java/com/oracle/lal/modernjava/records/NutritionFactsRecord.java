package com.oracle.lal.modernjava.records;

public record NutritionFactsRecord(long calories, long fat, int sodium, int carbohydrates) {
    public static final NutritionFactsRecord ZERO = new NutritionFactsRecord(0,0,0,0);

    public static NutritionFactsRecord of(long calories, long fat, int sodium, int carbohydrates) {
        return new NutritionFactsRecord(calories, fat, sodium, carbohydrates);
    }
    public NutritionFacts toNutritionFacts() {
        return new NutritionFacts(calories, fat, sodium, carbohydrates);
    }

}
