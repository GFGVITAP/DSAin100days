import java.util.Stack;

class TowerOfHanoi {
    public static void solveTowerOfHanoi(int numDisks, char source, char auxiliary, char target) {
        Stack<Integer> sourceStack = new Stack<>();
        Stack<Integer> auxiliaryStack = new Stack<>();
        Stack<Integer> targetStack = new Stack<>();

        for (int i = numDisks; i >= 1; i--) {
            sourceStack.push(i);
        }

        if (numDisks % 2 == 0) {
            char temp = auxiliary;
            auxiliary = target;
            target = temp;
        }

        int totalMoves = (int) (Math.pow(2, numDisks) - 1);

        for (int move = 1; move <= totalMoves; move++) {
            if (move % 3 == 1) {
                moveDiskBetweenPegs(sourceStack, targetStack, source, target);
            } else if (move % 3 == 2) {
                moveDiskBetweenPegs(sourceStack, auxiliaryStack, source, auxiliary);
            } else if (move % 3 == 0) {
                moveDiskBetweenPegs(auxiliaryStack, targetStack, auxiliary, target);
            }
        }
    }

    private static void moveDiskBetweenPegs(Stack<Integer> source, Stack<Integer> target, char sourceName, char targetName) {
        if (source.isEmpty() && !target.isEmpty()) {
            source.push(target.pop());
            System.out.println("Move disk from " + targetName + " to " + sourceName);
        } else if (!source.isEmpty() && target.isEmpty()) {
            target.push(source.pop());
            System.out.println("Move disk from " + sourceName + " to " + targetName);
        } else if (!source.isEmpty() && !target.isEmpty() && source.peek() > target.peek()) {
            source.push(target.pop());
            System.out.println("Move disk from " + targetName + " to " + sourceName);
        } else {
            target.push(source.pop());
            System.out.println("Move disk from " + sourceName + " to " + targetName);
        }
    }
}
