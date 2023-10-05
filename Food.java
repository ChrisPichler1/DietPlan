package diet;

public class Food {

private double Calories = 0;
private double Protein = 0;
private double Carbs = 0;
private double Sugar = 0;
private double Fat = 0;
private double SaturatedFat = 0;
private double Sodium = 0;

private static double proteinRatio = 0;
private static double carbRatio = 0;
private static double fatRatio = 0;
private static double caloriesForRatio = 0;
private static double totalCalories;
private static double totalProtein;
private static double totalCarbs;
private static double totalSugar;
private static double totalFat;
private static double totalSaturatedFat;
private static double totalSodium;

Food(double Calories, double Protein, double Carbs, double Sugar, double Fat, double SaturatedFat, double Sodium){
	this.Calories = Calories;
	this.Protein = Protein;
	this.Carbs = Carbs;
	this.Sugar = Sugar;
	this.Fat = Fat;
	this.SaturatedFat = SaturatedFat;
	this.Sodium = Sodium;
}

public static void addFood(Food food) {
	totalCalories += food.Calories;
	totalProtein += food.Protein;
	totalCarbs += food.Carbs;
	totalSugar += food.Sugar;
	totalFat += food.Fat;
	totalSaturatedFat += food.SaturatedFat;
	totalSodium += food.Sodium;
}

public static void printStats() {
	System.out.printf("Calories = %.1f g", totalCalories);
	if(totalCalories > 3750.0) {
		System.out.print("----------------------");
	}
	System.out.printf("\nProtein = %.1f g", totalProtein);
	if(totalProtein > 180.0) {
		System.out.print("----------------------");
	}
	System.out.printf("\nCarbs = %.1f g", totalCarbs);
	if(totalCarbs > 440.0) {
		System.out.print("----------------------");
	}
	System.out.printf("\nSugar = %.1f g", totalSugar);
	if(totalSugar > 141.0) {
		System.out.print("----------------------");
	}
	System.out.printf("\nFat = %.1f g", totalFat);
	if(totalFat > 125.0) {
		System.out.print("----------------------");
	}
	System.out.printf("\nSaturated Fat = %.1f g", totalSaturatedFat);
	if(totalSaturatedFat > 42.0) {
		System.out.print("----------------------");
	}
	System.out.printf("\nSodium = %.1f mg", totalSodium);
	if(totalSodium > 2300.0) {
		System.out.print("----------------------");
	}
	
	caloriesForRatio = (totalProtein * 4) + (totalCarbs * 4) + (totalFat * 9);
	proteinRatio = Math.round(((totalProtein * 4) / caloriesForRatio) * 100);
	carbRatio = Math.round(((totalCarbs * 4) / caloriesForRatio) * 100);
	fatRatio = Math.round(((totalFat * 9) / caloriesForRatio) * 100);
	
	System.out.printf("\n\nProtein ratio: %.0f%%", proteinRatio);
	System.out.print("\tThe goal is 25 - 30%");
	System.out.printf("\nCarb ratio: %.0f%%", carbRatio);
	System.out.print("\t\tThe goal is 55 - 60%");
	System.out.printf("\nFat ratio: %.0f%%", fatRatio);
	System.out.print("\t\tThe goal is 15 - 20%");
}

}
