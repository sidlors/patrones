#Builder

###Creating and Destroying Objects

Static factories and constructors share a limitation: they do not scale well to large numbers of optional parameters. Consider the case of a class representing the
Nutrition Facts label that appears on packaged foods. These labels have a few required fields—serving size, servings per container, and calories per serving—
and over twenty optional fields—total fat, saturated fat, trans fat, cholesterol, sodium, and so on. Most products have nonzero values for only a few of these
optional fields.

What sort of constructors or static factories should you write for such a class?

Traditionally, programmers have used the telescoping constructor pattern, in which you provide a constructor with only the required parameters, another with a
single optional parameter, a third with two optional parameters, and so on, culminating in a constructor with all the optional parameters. Here’s how it looks in
practice. For brevity’s sake, only four optional fields are shown:

```java
// Telescoping constructor pattern - does not scale well!
public class NutritionFacts {
private final int servingSize; // (mL) required
private final int servings; // (per container) required
private final int calories; // optional
private final int fat; // (g) optional
private final int sodium; // (mg) optional
private final int carbohydrate; // (g) optional
public NutritionFacts(int servingSize, int servings) {
this(servingSize, servings, 0);
}
public NutritionFacts(int servingSize, int servings,
int calories) {
this(servingSize, servings, calories, 0);
}
public NutritionFacts(int servingSize, int servings,
int calories, int fat) {
this(servingSize, servings, calories, fat, 0);
}
public NutritionFacts(int servingSize, int servings,
int calories, int fat, int sodium) {
this(servingSize, servings, calories, fat, sodium, 0);
}

public NutritionFacts(int servingSize, int servings,
int calories, int fat, int sodium, int carbohydrate) {
this.servingSize = servingSize;
this.servings = servings;
this.calories = calories;
this.fat = fat;
this.sodium = sodium;
this.carbohydrate = carbohydrate;
}
}
```

