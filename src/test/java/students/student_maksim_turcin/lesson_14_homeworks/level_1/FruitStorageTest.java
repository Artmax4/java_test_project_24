package students.student_maksim_turcin.lesson_14_homeworks.level_1;

import org.junit.jupiter.api.Test;
import students.student_maksim_turcin.lesson_14_homeworks.level_2.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FruitStorageTest {

    //Test1

    public List<Apple> findGreenApples() {
        List<Apple> greenApples = new ArrayList<>();
        greenApples.add(new Apple("green", 200));
        greenApples.add(new Apple("green", 90));
        greenApples.add(new Apple("green", 50));
        return greenApples;
    }

/*
    public List<Apple> findGreenApplesFail() {
        List<Apple> greenApples = new ArrayList<>();
        greenApples.add(new Apple("green", 200));
        greenApples.add(new Apple("green", 90));
        greenApples.add(new Apple("red", 50));
        return greenApples;
    }
*/
    @Test
    public void allGreenApplesTestPass() {
        FruitStorage appleStorage = new FruitStorage();
        List<Apple> appleStorageExpected = findGreenApples();
        List<Apple> appleStorageToCompare = appleStorage.findGreenApples(appleStorage.getAllApples());

        assertEquals(appleStorageExpected, appleStorageToCompare);
    }

/*
    @Test
    public void allGreenApplesTestFail() {
        FruitStorage appleStorage = new FruitStorage();
        List<Apple> appleStorageExpected = findGreenApplesFail();
        List<Apple> appleStorageToCompare = appleStorage.findGreenApples(appleStorage.getAllApples());

        assertEquals(appleStorageExpected, appleStorageToCompare);
    }
*/
    FruitStorage appleStorage = new FruitStorage();

    public List<Apple> appleStorage() {
        List<Apple> storage = new ArrayList<>();
        return storage = appleStorage.getAllApples();
    }

    //Test4
    public List<Apple> findGreenApples2() {
        List<Apple> greenApplesList = new ArrayList<>();
        greenApplesList.add(new Apple("green", 200));
        greenApplesList.add(new Apple("green", 90));
        greenApplesList.add(new Apple("green", 50));

        return greenApplesList;
    }

    public List<Apple> findRedApples() {
        List<Apple> redApplesList = new ArrayList<>();
        redApplesList.add(new Apple("red", 100));
        redApplesList.add(new Apple("red", 160));
        redApplesList.add(new Apple("red", 200));

        return redApplesList;
    }

    @Test
    public void findAppleByRedColor() {
        List<Apple> storage = appleStorage.getAllApples();
        String color = "red";
        List<Apple> expectedResult = findRedApples();
        List<Apple> actualResult = appleStorage.findApplesByColor(storage, color);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void findAppleByGreenColor() {
        List<Apple> storage = appleStorage.getAllApples();
        String color = "green";
        List<Apple> expectedResult = findGreenApples2();
        List<Apple> actualResult = appleStorage.findApplesByColor(storage, color);

        assertEquals(expectedResult, actualResult);
    }

    // Test5
    public List<Apple> findApplesByWeight() {
        List<Apple> heavyApples = new ArrayList<>();
        heavyApples.add(new Apple("red", 160));
        heavyApples.add(new Apple("red", 200));
        heavyApples.add(new Apple("green", 200));
        //  heavyApples.add(new Apple("yellow", 50));
        heavyApples.add(new Apple("yellow", 170));
        return heavyApples;
    }

    @Test
    public void findApplesHeavierThan150Test() {
        int appleWeightToCompare = 150;
        List<Apple> storage = appleStorage();
        List<Apple> expectedResult = findApplesByWeight();
        List<Apple> actualResult = appleStorage.findApplesByWeight(storage, appleWeightToCompare);

        assertEquals(expectedResult, actualResult);
    }

    //Task_10
    public List<Apple> setAllHeavyApples() {
        List<Apple> heavyApples = new ArrayList<>();
        heavyApples.add(new Apple("red", 160));
        heavyApples.add(new Apple("red", 200));
        heavyApples.add(new Apple("green", 200));
        heavyApples.add(new Apple("yellow", 170));

        return heavyApples;
    }

    public List<Apple> setAllLightApples() {
        List<Apple> lightWeightApples = new ArrayList<>();
        lightWeightApples.add(new Apple("red", 100));
        lightWeightApples.add(new Apple("green", 90));
        lightWeightApples.add(new Apple("green", 50));
        lightWeightApples.add(new Apple("yellow", 50));
        return lightWeightApples;
    }

    public List<Apple> setAllGreenApples() {
        List<Apple> greenApplesList = new ArrayList<>();
        greenApplesList.add(new Apple("green", 200));
        greenApplesList.add(new Apple("green", 90));
        greenApplesList.add(new Apple("green", 50));
        return greenApplesList;
    }

    public List<Apple> setAllRedApples() {
        List<Apple> redApplesList = new ArrayList<>();
        redApplesList.add(new Apple("red", 100));
        redApplesList.add(new Apple("red", 160));
        redApplesList.add(new Apple("red", 200));
        return redApplesList;
    }

    @Test
    public void findAllGreenApples() {
        List<Apple> storage = FruitStorage.getAllApples();
        List<Apple> expectedResult = setAllGreenApples();
        List<Apple> actualResult = FruitStorage.findApples(storage, new AppleGreenColorPredicate());
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void findAllRedApples() {
        List<Apple> storage = FruitStorage.getAllApples();
        List<Apple> expectedResult = setAllRedApples();
        List<Apple> actualResult = FruitStorage.findApples(storage, new AppleRedColorPredicate());
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void findAllHeavyApples() {
        List<Apple> storage = FruitStorage.getAllApples();
        List<Apple> expectedResult = setAllHeavyApples();
        List<Apple> actualResult = FruitStorage.findApples(storage, new AppleHeavyWeightPredicate());
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void findAlLightWeightApples() {
        List<Apple> storage = FruitStorage.getAllApples();
        List<Apple> expectedResult = setAllLightApples();
        List<Apple> actualResult = FruitStorage.findApples(storage, new LightWeightApplePredicate());
        assertEquals(expectedResult, actualResult);
    }

    //Task_11
    public List<Apple> setAllGreenHeavyApples() {
        List<Apple> greenHeavy = new ArrayList<>();
        greenHeavy.add(new Apple("green", 200));

        return greenHeavy;

    }

    @Test
    public void findAllGreenHeavyApples() {
        List<Apple> storage = FruitStorage.getAllApples();
        List<Apple> expectedResult = setAllGreenHeavyApples();
        List<Apple> actualResult = FruitStorage.findApples(storage, new AppleGreenAndHeavyWeightPredicate());
        assertEquals(expectedResult, actualResult);
    }

    FruitStorage storage = storage = new FruitStorage();
    private String greenColor = "green";
    private String redColor = "red";
    private int appleWeight = 150;

    public List<Apple> createFruitStorage() {
        List<Apple> apples = storage.getAllApples();
        return apples;
    }

    @Test
    public void createAnonimClassForGreenAppleSearch() {
        List<Apple> apples = createFruitStorage();
        List<Apple> greenAppleListTest = storage.findApples(apples, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return greenColor.equals(apple.getColor());
            }
        });
        for (Apple greenApple : greenAppleListTest) {
            assertEquals(greenColor, greenApple.getColor());
        }
    }

    @Test
    public void createAnonimClassForRedAppleSearch() {
        List<Apple> apples = createFruitStorage();
        List<Apple> redAppleListTest = storage.findApples(apples, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return redColor.equals(apple.getColor());
            }
        });
        for (Apple redApple : redAppleListTest) {
            assertEquals(redColor, redApple.getColor());
        }
    }

    @Test
    public void createAnonimClassForHeavyAppleSearch() {
        List<Apple> apples = createFruitStorage();
        List<Apple> heavyAppleListTest = storage.findApples(apples, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight() > appleWeight;
            }
        });
        for (Apple heavyApple : heavyAppleListTest) {
            assertTrue(heavyApple.getWeight() > appleWeight);
        }
    }

    @Test
    public void createAnonimClassForLightWeightAppleSearch() {
        List<Apple> apples = createFruitStorage();
        List<Apple> lightWeightAppleListTest = storage.findApples(apples, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight() < appleWeight;
            }
        });
        for (Apple lightWeightApple : lightWeightAppleListTest) {
            assertTrue(lightWeightApple.getWeight() < appleWeight);
        }
    }

    @Test
    public void createAnonimClassForGreenAppleSearchLambda() {
        List<Apple> appleStorage = createFruitStorage();
        List<Apple> greenAppleListTest = storage.findApples(appleStorage,

                (Apple apple) -> greenColor.equals(apple.getColor()));

        for (Apple greenApple : greenAppleListTest) {
            assertEquals(greenColor, greenApple.getColor());
        }
    }

    @Test
    public void createAnonimClassForRedAppleSearchLambda() {
        List<Apple> appleStorage = createFruitStorage();
        List<Apple> redAppleListTest = storage.findApples(appleStorage,

                (Apple apple) -> redColor.equals(apple.getColor()));

        for (Apple redApple : redAppleListTest) {
            assertEquals(redColor, redApple.getColor());
        }
    }

    @Test
    public void createAnonimClassForHeavyAppleSearchLambda() {
        List<Apple> appleStorage = createFruitStorage();
        List<Apple> heavyAppleListTest = storage.findApples(appleStorage,

                (Apple apple) -> apple.getWeight() > appleWeight);

        for (Apple heavyApple : heavyAppleListTest) {
            assertTrue(heavyApple.getWeight() > appleWeight);
        }
    }

    @Test
    public void createAnonimClassForLightWeightAppleSearchLambda() {
        List<Apple> appleStorage = createFruitStorage();
        List<Apple> lightWeightAppleListTest = storage.findApples(appleStorage,

                (Apple apple) -> apple.getWeight() < appleWeight);

        for (Apple lightWeightApple : lightWeightAppleListTest) {
            assertTrue(lightWeightApple.getWeight() < appleWeight);
        }
    }
}
