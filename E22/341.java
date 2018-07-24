public class NestedIterator implements Iterator<Integer> {
    Stack<Iterator<NestedInteger>> stack = new Stack<Iterator<NestedInteger>>();
    Integer value = 0;
    public NestedIterator(List<NestedInteger> nestedList) {
        stack.push(nestedList.listIterator());
    }

    @Override
    public Integer next() {
        return value;
    }

    @Override
    public boolean hasNext() {
        Iterator<NestedInteger> top = stack.peek();
        if (top.hasNext())
        {
            NestedInteger val = top.next();
            if (val.isInteger())
            {
                value = val.getInteger();
                return true;
            }
            else
            {
                stack.push(val.getList().listIterator());
                return this.hasNext();
            }
        }
        else
        {
            stack.pop();
            if (stack.empty())
                return false;
            return this.hasNext();
        }
    }
}