package assignments.week6.chapter17;

import java.util.List;

public class IntTreeMain {
    public static void main(String[] args) {
        IntTree referenceTree1 = new IntTree(6);
        System.out.println(referenceTree1.countLeftNodes());
        System.out.println();

        System.out.println(referenceTree1.countEmpty());
        System.out.println();

        System.out.println(referenceTree1.depthSum());
        System.out.println();

        System.out.println(referenceTree1.countEvenBranches());
        System.out.println();

        referenceTree1.printLevel(2);
        System.out.println();

        referenceTree1.printLeaves();
        System.out.println();

        System.out.println(referenceTree1.isFull());
        System.out.println();

        System.out.println(referenceTree1);
        System.out.println();

        System.out.println(referenceTree1.equals(new IntTree(6)));
        System.out.println();

        referenceTree1.doublePositives();
        System.out.println(referenceTree1);
        System.out.println();

        System.out.println(referenceTree1.numberNodes());
        System.out.println();

        referenceTree1.removeLeaves();
        System.out.println(referenceTree1);
        System.out.println();

        IntTree referenceTree2 = referenceTree1.copy();
        System.out.println(referenceTree2);
        System.out.println(referenceTree1.equals(referenceTree2));
        System.out.println();

        referenceTree2.completeToLevel(5);
        System.out.println(referenceTree2);
        System.out.println();

        referenceTree2.trim(1, 5);
        System.out.println(referenceTree2);
        System.out.println();

        IntTree referenceTree3 = new IntTree(6);
        referenceTree3.tighten();
        System.out.println(referenceTree3);
        System.out.println();

        IntTree referenceTree4 = referenceTree3.combineWith(referenceTree2);
        System.out.println(referenceTree4);
        System.out.println();

        List<Integer> list = referenceTree4.inOrderList();
        System.out.println(list);
        System.out.println();

        referenceTree4.evenLevels();
        System.out.println(referenceTree4);
        System.out.println();

        referenceTree3.makePerfect();
        System.out.println(referenceTree3);
        System.out.println();
    }
}
