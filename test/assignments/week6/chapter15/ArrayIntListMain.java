package assignments.week6.chapter15;

public class ArrayIntListMain {
    public static void main(String[] args) {
        int[] exerciseOneArr = {1, 18, 2, 7, 18, 39, 18, 40};
        ArrayIntList exerciseOne = buildArr(exerciseOneArr);

        System.out.println(exerciseOne.lastIndexOf(18));
        System.out.println(exerciseOne.lastIndexOf(3));

        int[] exerciseTwoAArr = {11, -7, 3, 42, 0, 14};
        int[] exerciseTwoBArr = {3, 42, 0};
        ArrayIntList exerciseTwoA = buildArr(exerciseTwoAArr);
        ArrayIntList exerciseTwoB = buildArr(exerciseTwoBArr);
        System.out.println(exerciseTwoA.indexOfSubList(exerciseTwoB));

        int[] exerciseThreeArr = {11, -7, 3, 42, 3, 0, 14, 3};
        ArrayIntList exerciseThree = buildArr(exerciseThreeArr);
        exerciseThree.replaceAll(3, 999);
        System.out.println(exerciseThree);

        int[] exerciseFourArr = {11, -7, 3, 42, 0, 14, 56};
        ArrayIntList exerciseFour = buildArr(exerciseFourArr);
        exerciseFour.reverse();
        System.out.println(exerciseFour);

        int[] exerciseFiveArr = {2, 3, 5, 4, 7, 15, 20, 7};
        ArrayIntList exerciseFive = buildArr(exerciseFiveArr);
        System.out.println(exerciseFive.runningTotal());

        int[] exerciseSixArr = {42, -7, 3, 0, 15};
        ArrayIntList exerciseSix = buildArr(exerciseSixArr);
        exerciseSix.fill(2);
        System.out.println(exerciseSix);

        int[] exerciseSevenAArr = {3, 8, 2, 5, 19, 24, -3, 0, 4, 4, 8, 205, 42};
        int[] exerciseSevenBArr = {7, 42, 308, 409, 19, 17, 2};
        ArrayIntList exerciseSevenA = buildArr(exerciseSevenAArr);
        ArrayIntList exerciseSevenB = buildArr(exerciseSevenBArr);
        System.out.println(exerciseSevenA.isPairwiseSorted());
        System.out.println(exerciseSevenB.isPairwiseSorted());

        int[] exerciseEightArr = {2, -3, 2, 0, 5, 2, 2, 6};
        ArrayIntList exerciseEight = buildArr(exerciseEightArr);
        System.out.println(exerciseEight.count(2));

        int[] exerciseNineArr = {1, 3, 4, 7, 7, 7, 7, 9, 9, 11, 13, 14, 14, 14, 16, 16, 18, 19, 19, 19};
        ArrayIntList exerciseNine = buildArr(exerciseNineArr);
        System.out.println(exerciseNine.maxCount());

        int[] exerciseTenArr = {1, 3, 5, 2, 9, 7, -3, 0, 42, 308, 17};
        ArrayIntList exerciseTen = buildArr(exerciseTenArr);
        System.out.println(exerciseTen.longestSortedSequence());

        int[] exerciseElevenArr = {8, 17, 42, 3, 8};
        ArrayIntList exerciseEleven = buildArr(exerciseElevenArr);
        System.out.println(exerciseEleven.removeLast());
        System.out.println(exerciseEleven.removeLast());
        System.out.println(exerciseEleven);

        int[] exerciseTwelveArr = {8, 17, 9, 24, 42, 3, 8};
        ArrayIntList exerciseTwelve = buildArr(exerciseTwelveArr);
        exerciseTwelve.removeFront(4);
        System.out.println(exerciseTwelve);

        int[] exerciseThirteenArr = {8, 17, 9, 24, 42, 3, 8};
        ArrayIntList exerciseThirteen = buildArr(exerciseThirteenArr);
        exerciseThirteen.removeAll(8);
        System.out.println(exerciseThirteen);

        int[] exerciseFourteenAArr = {4, 3, 2, 1};
        int[] exerciseFourteenBArr = {1, 2, 3, 4};
        ArrayIntList exerciseFourteenA = buildArr(exerciseFourteenAArr);
        ArrayIntList exerciseFourteenB = buildArr(exerciseFourteenBArr);
        exerciseFourteenA.printInversions();
        exerciseFourteenB.printInversions();

        int[] exerciseFifteenArr = {1, 3, 2, 7};
        ArrayIntList exerciseFifteen = buildArr(exerciseFifteenArr);
        exerciseFifteen.mirror();
        System.out.println(exerciseFifteen);

        int[] exerciseSixteenArr = {42, 7, 0, -3, 15};
        ArrayIntList exerciseSixteen = buildArr(exerciseSixteenArr);
        exerciseSixteen.stutter();
        System.out.println(exerciseSixteen);

        int[] exerciseSeventeenArr = {18, 7, 4, 24, 11};
        ArrayIntList exerciseSeventeen = buildArr(exerciseSeventeenArr);
        exerciseSeventeen.stretch(3);
        System.out.println(exerciseSeventeen);

        int[] exerciseEighteenArr = {1, 8, 2, 7};
        ArrayIntList exerciseEighteen = buildArr(exerciseEighteenArr);
        exerciseEighteen.doubleList();
        System.out.println(exerciseEighteen);

        int[] exerciseNineteenArr = {1, 7, 3, 9, 4, 6, 5};
        ArrayIntList exerciseNineteen = buildArr(exerciseNineteenArr);
        exerciseNineteen.compress();
        System.out.println(exerciseNineteen);

        int[] exerciseTwentyArr = {8, 23, 19, 7, 12, 4};
        ArrayIntList exerciseTwenty = buildArr(exerciseTwentyArr);
        exerciseTwenty.rotate();
        System.out.println(exerciseTwenty);

        int[] exerciseTwentyOneArr = {10, 25, 31, 47, 52, 68, 77};
        ArrayIntList exerciseTwentyOne = buildArr(exerciseTwentyOneArr);
        exerciseTwentyOne.switchPairs();
        System.out.println(exerciseTwentyOne);

        int[] exerciseTwentyTwoArr = {5, 2, 2, -5, 4, 3, 2, 4, 1, 1, 1, 0, 2, 17};
        ArrayIntList exerciseTwentyTwo = buildArr(exerciseTwentyTwoArr);
        ArrayIntList exerciseTwentyTwo2 = exerciseTwentyTwo.fromCounts();
        System.out.println(exerciseTwentyTwo2);
    }

    public static ArrayIntList buildArr(int[] values) {
        ArrayIntList list = new ArrayIntList();
        for (int i = 0; i < values.length; i++) {
            list.add(values[i]);
        }
        return list;
    }
}
