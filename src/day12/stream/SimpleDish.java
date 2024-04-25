package day12.stream;

public class SimpleDish {

    private final String name; // 요리 이름
    private final int calories; // 칼로리

    public SimpleDish(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    // 4종류에서 2종류만 추출
    public SimpleDish(Dish dish) {
        this.name = dish.getName();
        this.calories = dish.getCalories();
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    @Override
    public String toString() {
        return "SimpleDish{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                '}';
    }
}
