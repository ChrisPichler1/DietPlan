package diet;

public class Day {
	private double calories;
	private double protein;
	private double carbs;
	private double sugar;
	private double fat;
	private double saturatedFat;
	private double sodium;
	
	public Day(double calories, double protein, double carbs, double sugar, double fat, double saturatedFat, double sodium) {
		this.calories = calories;
		this.protein = protein;
		this.carbs = carbs;
		this.sugar = sugar;
		this.fat = fat;
		this.saturatedFat = saturatedFat;
		this.sodium = sodium;
	}
	
	public static void printStats(Day monday, Day tuesday, Day wednesday, Day thursday, Day friday, Day saturday, Day sunday) {
		double totalCalories = monday.calories + tuesday.calories + wednesday.calories + thursday.calories + friday.calories + saturday.calories + sunday.calories;
		double totalProtein = monday.protein + tuesday.protein + wednesday.protein + thursday.protein + friday.protein + saturday.protein + sunday.protein;
		double totalCarbs = monday.carbs + tuesday.carbs + wednesday.carbs + thursday.carbs + friday.carbs + saturday.carbs + sunday.carbs;
		double totalSugar = monday.sugar + tuesday.sugar + wednesday.sugar + thursday.sugar + friday.sugar + saturday.sugar + sunday.sugar;
		double totalFat = monday.fat + tuesday.fat + wednesday.fat + thursday.fat + friday.fat + saturday.fat + sunday.fat;
		double totalSaturatedFat = monday.saturatedFat + tuesday.saturatedFat + wednesday.saturatedFat + thursday.saturatedFat + friday.saturatedFat + saturday.saturatedFat + sunday.saturatedFat;
		double totalSodium = monday.sodium + tuesday.sodium + wednesday.sodium + thursday.sodium + friday.sodium + saturday.sodium + sunday.sodium;
		double exactCalories = (4 * totalCarbs) + (4 * totalProtein) + (9 * totalFat);
		double proteinRatio = (4 * totalProtein) / exactCalories;
		double carbRatio = (4 * totalCarbs) / exactCalories;
		double fatRatio = (9 * totalFat) / exactCalories;
		String good = "\tGreat job!";
		String bad = "\tNot good!";

		
		System.out.print("Calorie Goal: 26250\tTotal Calories: " + Math.round(totalCalories) + "\tDifference: " + (26250 - Math.round(totalCalories)) + "\t");
		if(Math.abs((26250 - Math.round(totalCalories))) > 1312.5) {
			System.out.println(bad);
		}
		else {
			System.out.println(good);
		}
		
		System.out.print("Protein Goal: 1309\tTotal Protein: " + Math.round(totalProtein) + "\tDifference: " + (1309 - Math.round(totalProtein)) + "\t");
		if(Math.abs((1309 - Math.round(totalProtein))) > 65.45) {
			System.out.println(bad);
		}
		else {
			System.out.println(good);
		}
		
		System.out.print("Carbs Goal: 3283\tTotal Carbs: " + Math.round(totalCarbs) + "\tDifference: " + (3283 - Math.round(totalCarbs)) + "\t");
		if(Math.abs((3283 - Math.round(totalCarbs))) > 164.15) {
			System.out.println(bad);
		}
		else {
			System.out.println(good);
		}
		
		System.out.print("Sugar Goal: 987\t\tTotal Sugar: " + Math.round(totalSugar) + "\tDifference: " + (987 - Math.round(totalSugar)) + "\t");
		if(987 - totalSugar > 0) {
			System.out.println(good);
		}
		else {
			System.out.println(bad);
		}
		
		System.out.print("Fat Goal: 875\t\tTotal Fat: " + Math.round(totalFat) + "\t\tDifference: " + (875 - Math.round(totalFat)) + "\t");
		if(Math.abs((875 - Math.round(totalFat))) > 43.75) {
			System.out.println(bad);
		}
		else {
			System.out.println(good);
		}
		
		System.out.print("Sat Fat Goal: 294\tTotal Sat Fat: "+ Math.round(totalSaturatedFat) + "\tDifference: " + (294 - Math.round(totalSaturatedFat)) + "\t");
		if(294 - totalSaturatedFat > 0) {
			System.out.println(good);
		}
		else {
			System.out.println(bad);
		}
		
		System.out.print("Sodium Goal: 16100\tTotal Sodium: " + Math.round(totalSodium) + "\tDifference: " + (16100 - Math.round(totalSodium)) + "\t");
		if(16100 - totalSodium > 0) {
			System.out.println(good);
		}
		else {
			System.out.println(bad);
		}
		
		System.out.println("\nCalorie Ratio of Protein: \t" + (Math.round(proteinRatio * 100)) + "%");
		System.out.println("Calorie Ratio of Carbs: \t" + (Math.round(carbRatio * 100)) + "%");
		System.out.println("Calorie Ratio of Fat: \t\t" + (Math.round(fatRatio * 100)) + "%");
		
	}
}
