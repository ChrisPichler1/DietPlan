package diet;

public class FoodObjects {

	public static void main(String[] args) {
		//Calories, Protein, Carbs, Sugar, Fat, Saturated Fat, Sodium
		Food almonds = new Food(160.0, 6.0, 6.0, 2.0, 14.0, 1.0, 0.0); // 1 serving
		Food bagel = new Food(270.0, 10.0, 53.0, 6.0, 1.5, 0.5, 450.0); //1 Thomas bagel
		Food banana = new Food(89.0, 1.0, 23.0, 12.0, 0.0, 0.0, 0.0);
		Food blueberries = new Food(84.0, 1.0, 21.0, 15.0, 0.5, 0.0, 1.5);
		Food brownRice = new Food(720.0, 16.0, 156.0, 0.0, 6.0, 0.0, 0.0); //Two cups
		Food carrots = new Food(55.0, 1.2, 13.0, 5.4, 0.3, 0.1, 90.0); //One cup
		Food cashews = new Food(170.0, 5.0, 8.0, 1.0, 13.0, 2.0, 120.0);// 1 serving of Kroger Salted with Sea Salt cashews
		Food chickenBreast = new Food(440.0, 92.0, 0.0, 0.0, 10.0, 2.0, 720.0); //Tyson; One pound
		Food chocolateIceCream = new Food(180.0, 4.0, 24.0, 17.0, 8.0, 5.0, 70.0); //1 serving
		Food dominosCinnamonSticks = new Food(940.0, 16.0, 109.0, 24.0, 49.0, 9.0, 690.0);
		Food dominosIcingCups = new Food(500.0, 0.0, 114.0, 110.0, 5.0, 1.0, 0.0); //2 cups
		Food dominosLargeCheesePizza = new Food(2160.0, 88.0, 272.0, 24.0, 72.0, 36.0, 4560.0);
		Food dominosTwoMarinaraCups = new Food(60.0, 0.0, 12.0, 8.0, 0.0, 0.0, 580.0);
		Food drPepper = new Food(280.0, 0.0, 75.0, 73.0, 0.0, 0.0, 90.0); //Large
		Food freeBagel = new Food(200.0, 7.0, 41.0, 2.0, 1.5, 0.0, 420.0); //1 Gordon Choice Sliced Plain Bagel
		Food grapes = new Food(62.0, 0.6, 16.0, 15.0, 0.3, 0.0, 2.0); //One cup
		Food greenApple = new Food(52.0, 0.0, 14.0, 10.0, 0.0, 0.0, 0.0);
		Food hungryHowieBread = new Food(1120.0, 32.0, 192.0, 4.0, 24.0, 0.0, 1520.0);
		Food hungryHowiesMediumCheese = new Food(1440.0, 72.0, 200.0, 16.0, 40.0, 24.0, 1840.0);
		Food hungryHowiesLargeCheese = new Food(2000.0, 96.0, 272.0, 16.0, 56.0, 32.0, 2560.0);
		Food hungryHowiesPizzaSauceCup = new Food(35.0, 1.0, 7.0, 4.0, 0.0, 0.0, 190.0); //1 cup
		Food hungryHowiesXLargeCheese = new Food(2800.0, 136.0, 384.0, 24.0, 80.0, 48.0, 3600.0);
		Food jimmyJohnsTurkey8Inch = new Food(480.0, 23.0, 48.0, 2.0, 19.0, 2.5, 1160.0);
		Food laysChipsBag = new Food(420.0, 4.0, 40.0, 2.0, 27.0, 3.5, 440.0);
		Food littleCaesarsCheesePizza = new Food(1950.0, 95.0, 248.0, 12.0, 65.0, 31.0, 3680.0);
		Food mcNuggets = new Food(830.0, 46.0, 51.0, 0.0, 49.0, 8.0, 1670.0); //20 piece
		Food metRXBar = new Food(410.0, 32.0, 41.0, 26.0, 14.0, 6.0, 410.0);
		Food milk = new Food(130.0, 10.0, 3.0, 2.0, 8.0, 0.5, 230.0); //Silk Milk
		Food oatsOverNightBirthdayCake = new Food(280.0, 20.0, 41.0, 9.0, 5.0, 1.5, 160.0);
		Food oatsOverNightCinnamonRoll = new Food(250.0, 20.0, 32.0, 8.0, 5.0, 1.0, 270.0);
		Food oatsOverNightCookiesAndCream = new Food(280.0, 20.0, 41.0, 7.0, 6.0, 1.5, 370.0);
		Food oliveOil = new Food(120.0, 0.0, 0.0, 0.0, 14.0, 2.0, 0.0); //1 serving
		Food pickle = new Food(0.0, 0.0, 1.5, 0.0, 0.0, 0.0, 330.0); //1 pickle
		Food porkLoin = new Food(160.0, 23.0, 0.0, 0.0, 6.0, 2.5, 75.0); //Kroger
		Food proteinBar = new Food(220.0, 15.0, 23.0, 17.0, 7.0, 4.0, 230.0); //Cinnamon Roll
		Food proteinPowder = new Food(120.0, 24.0, 3.0, 1.0, 1.5, 1.0, 50.0);
		Food raspberries = new Food(32.0, 1.0, 7.0, 3.0, 0.0, 0.0, 1.0); //1/2 cup
		Food redDeliciousApple = new Food(125.0, 0.6, 29.8, 22.2, 0.4, 0.0, 2.1);
		Food redPepper = new Food(32.0, 1.0, 7.6, 5.0, 0.2, 0.0, 2.3);
		Food shake = new Food(609.0, 44.0, 49.0, 27.5, 28.5, 7.0, 440.0); //Peanut Butter Chocolate
		Food skinnyPop = new Food(150.0, 2.0, 15.0, 0.0, 10.0, 1.0, 75.0);
		Food strawberries = new Food(45.0, 1.0, 11.0, 7.0, 0.0, 0.0, 0.0); //One cup
		Food subwayColdCutSixInch = new Food(425.0, 17.0, 36.0, 3.0, 27.0, 4.0, 1320.0);
		Food subwayColdCutFootlong = new Food(850.0, 34.0, 72.0, 6.0, 54.0, 8.0, 2640.0);
		Food subwayItalianBMTFootlong = new Food(700.0, 38.0, 76.0, 6.0, 44.0, 12.0, 2870.0);
		Food subwayItalianBMTSixInch = new Food(350.0, 19.0, 38.0, 3.0, 22.0, 6.0, 1435.0);
		Food sweetPotato = new Food(114.0, 2.1, 27.0, 6.0, 0.1, 0.0, 73.0);
		
		
		
		Food.printStats();
		
		Day a = new Day(3512.0, 236.1, 453.6, 138.8, 96.7, 21.7, 2538.3);
		Day b = new Day(3124.0, 210.8, 378.0, 94.9, 100.6, 14.6, 1828.5);
		Day c = new Day(3519.0, 154.0, 457.6, 108.3, 117.6, 44.7, 5636.8);
		
		
		//Day.printStats(a, b, c, d, e, f, cheat);
		
		//Daily Goal: Calories: 3,750, Protein: 180, Carbs: 440, Sugar: 141, Fat: 125, Saturated Fat: 42, Sodium: 2,300
		//Calorie Ratio Goal: 55% Carbs, 25% Protein, 20% Fat
		
		//Week Goal: Calories: 26250, Protein: 1309, Carbs: 3283, Sugar: 987, Fat: 875, Saturated Fat: 294, Sodium: 16100
		//Ratio Order: Protein, Carbs, Fat
		
		Week one =   new Week(24867, 1469, 3018, 915,  832, 160, 22979, 23, 48, 29);
		Week two =   new Week(24522, 1540, 3075, 713,  778, 170, 21168, 24, 48, 27);
		Week three = new Week(24043, 1488, 3059, 1041, 743, 147, 16113, 24, 49, 27);
		Week four =  new Week(24786, 1545, 3109, 711,  761, 183, 23670, 24, 49, 27);
	}

}
