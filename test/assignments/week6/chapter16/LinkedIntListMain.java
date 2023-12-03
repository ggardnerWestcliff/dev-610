package assignments.week6.chapter16;

public class LinkedIntListMain {
    public static void main(String[] args) {
        int[] exerciseOneArr = {1, 2, 3, 4};
        LinkedIntList exerciseOne = buildLinkedIntList(exerciseOneArr);
        exerciseOne.set(2, 5);
        System.out.println(exerciseOne);

        LinkedIntList exerciseTwo = buildLinkedIntList(exerciseOneArr);
        System.out.println(exerciseTwo.min());

        LinkedIntList exerciseThree = buildLinkedIntList(exerciseOneArr);
        System.out.println(exerciseThree.isSorted());
        System.out.println(exerciseOne.isSorted());

        int[] exerciseFourArr = {1, 18, 2, 7, 18, 39, 18, 40};
        LinkedIntList exerciseFour = buildLinkedIntList(exerciseFourArr);
        System.out.println(exerciseFour.lastIndexOf(18));
        System.out.println(exerciseFour.lastIndexOf(3));

        int[] exerciseFiveArr = {1, 1, 1, 3, 3, 6, 9, 15, 15, 23, 23, 23, 40, 40};
        LinkedIntList exerciseFive = buildLinkedIntList(exerciseFiveArr);
        System.out.println(exerciseFive.countDuplicates());

        int[] exerciseSixArr = {1, 18, 2, 7, 8, 39, 18, 40};
        LinkedIntList exerciseSix = buildLinkedIntList(exerciseSixArr);
        System.out.println(exerciseSix.hasTwoConsecutive());

        LinkedIntList exerciseSeven = buildLinkedIntList(exerciseSixArr);
        System.out.println(exerciseSeven.deleteBack());
        System.out.println(exerciseSeven);

        int[] exerciseEightArr = {10, 25, 31, 47, 52, 68, 77};
        LinkedIntList exerciseEight = buildLinkedIntList(exerciseEightArr);
        exerciseEight.switchPairs();
        System.out.println(exerciseEight);

        int[] exerciseNineArr = {1, 8, 19, 4, 17};
        LinkedIntList exerciseNine = buildLinkedIntList(exerciseNineArr);
        exerciseNine.stutter();
        System.out.println(exerciseNine);

        int[] exerciseTenArr = {18, 7, 4, 24, 11};
        LinkedIntList exerciseTen = buildLinkedIntList(exerciseTenArr);
        exerciseTen.stretch(3);
        System.out.println(exerciseTen);

        int[] exerciseElevenArr = {1, 7, 3, 9, 4, 6, 5};
        LinkedIntList exerciseEleven = buildLinkedIntList(exerciseElevenArr);
        exerciseEleven.compress();
        System.out.println(exerciseEleven);

        int[] exerciseTwelveArr = {8, 7, -4, 19, 0, 43, -8, -7, 2};
        LinkedIntList exerciseTwelve = buildLinkedIntList(exerciseTwelveArr);
        exerciseTwelve.split();
        System.out.println(exerciseTwelve);

        int[] exerciseThirteenAArr = {8, 17, 2, 4};
        int[] exerciseThirteenBArr = {1, 2, 3};
        LinkedIntList exerciseThirteenA = buildLinkedIntList(exerciseThirteenAArr);
        LinkedIntList exerciseThirteenB = buildLinkedIntList(exerciseThirteenBArr);
        exerciseThirteenB.transferFrom(exerciseThirteenA);
        System.out.println(exerciseThirteenA);
        System.out.println(exerciseThirteenB);

        int[] exerciseFourteenArr = {3, 9, 4, 2, 3, 8, 17, 4, 3, 18};
        LinkedIntList exerciseFourteen = buildLinkedIntList(exerciseFourteenArr);
        exerciseFourteen.removeAll(3);
        System.out.println(exerciseFourteen);

        LinkedIntList exerciseFifteenA = buildLinkedIntList(exerciseFourteenArr);
        LinkedIntList exerciseFifteenB = buildLinkedIntList(exerciseFourteenArr);
        System.out.println(exerciseFifteenA.equals(exerciseFifteenB));
        exerciseFifteenA.removeAll(3);
        System.out.println(exerciseFifteenA.equals(exerciseFifteenB));

        int[] exerciseSixteenArr = {8, 13, 17, 4, 9, 12, 98, 41, 7, 23, 0, 92};
        LinkedIntList exerciseSixteen = buildLinkedIntList(exerciseSixteenArr);
        LinkedIntList exerciseSixteenA = exerciseSixteen.removeEvens();
        System.out.println(exerciseSixteen);
        System.out.println(exerciseSixteenA);

        int[] exerciseSeventeenArr = {8, 13, 17, 4, 9, 12, 98, 41, 7, 23, 0, 92};
        LinkedIntList exerciseSeventeen = buildLinkedIntList(exerciseSeventeenArr);
        exerciseSeventeen.removeRange(3, 8);
        System.out.println(exerciseSeventeen);

        int[] exerciseEighteenArr = {1, 3, 2, 7};
        LinkedIntList exerciseEighteen = buildLinkedIntList(exerciseEighteenArr);
        exerciseEighteen.doubleList();
        System.out.println(exerciseEighteen);

        int[] exerciseNineteenArr = {8, 23, 19, 7, 45, 98, 102, 4};
        LinkedIntList exerciseNineteen = buildLinkedIntList(exerciseNineteenArr);
        exerciseNineteen.rotate();
        System.out.println(exerciseNineteen);

        int[] exerciseTwentyArr = {10, 31, 42, 23, 44, 75, 86};
        LinkedIntList exerciseTwenty = buildLinkedIntList(exerciseTwentyArr);
        exerciseTwenty.shift();
        System.out.println(exerciseTwenty);

        int[] exerciseTwentyOneAArr = {0, 1, 2, 1};
        int[] exerciseTwentyOneBArr = {0, 1, 0};
        int[] exerciseTwentyOneCArr = {0, 1, 2};
        LinkedIntList exerciseTwentyOneA = buildLinkedIntList(exerciseTwentyOneAArr);
        LinkedIntList exerciseTwentyOneB = buildLinkedIntList(exerciseTwentyOneBArr);
        LinkedIntList exerciseTwentyOneC = buildLinkedIntList(exerciseTwentyOneCArr);
        exerciseTwentyOneA.surround(1, 4);
        exerciseTwentyOneB.surround(1, 1);
        exerciseTwentyOneC.surround(3, 4);
        System.out.println(exerciseTwentyOneA);
        System.out.println(exerciseTwentyOneB);
        System.out.println(exerciseTwentyOneC);

        int[] exerciseTwentyTwoArr = {1, 8, 19, 4, 17};
        LinkedIntList exerciseTwentyTwo = buildLinkedIntList(exerciseTwentyTwoArr);
        exerciseTwentyTwo.reverse();
        System.out.println(exerciseTwentyTwo);
    }

    public static LinkedIntList buildLinkedIntList(int[] arr) {
        LinkedIntList list = new LinkedIntList();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        return list;
    }
}
