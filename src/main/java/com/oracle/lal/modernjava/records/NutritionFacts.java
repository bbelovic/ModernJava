package com.oracle.lal.modernjava.records;

import java.util.Objects;

public final class NutritionFacts {
    private final long calories;
    private final long fat;
    private final int sodium;
    private final int carbohydrates;

    public NutritionFacts(long calories, long fat, int sodium, int carbohydrates) {
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrates = carbohydrates;
    }

    public long getCalories() {
        return calories;
    }

    public long getFat() {
        return fat;
    }

    public int getSodium() {
        return sodium;
    }

    public int getCarbohydrates() {
        return carbohydrates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NutritionFacts that = (NutritionFacts) o;
        return calories == that.calories && fat == that.fat && sodium == that.sodium && carbohydrates == that.carbohydrates;
    }

    @Override
    public int hashCode() {
        return Objects.hash(calories, fat, sodium, carbohydrates);
    }

    @Override
    public String toString() {
        return "NutritionFacts[calories=%d, fat=%d, sodium=%d, carbohydrates=%d]"
                .formatted(calories, fat, sodium, carbohydrates);
    }
}
