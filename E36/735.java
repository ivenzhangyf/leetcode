public class AsteroidCollision {
	public int[] asteroidCollision(int[] asteroids) {
        if(asteroids == null || asteroids.length == 0) return null;
        if(asteroids.length == 1) return asteroids;
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(asteroids[0]);

        for(int i = 1;i < asteroids.length;i++) {
    		//test case 想清楚
        		if(stack.isEmpty()) stack.push(asteroids[i]);
        		else if(stack.peek() > 0 && asteroids[i] < 0) {
    					if(stack.peek() == (-asteroids[i])) 
    						stack.pop();
    					else if(stack.peek() > (-asteroids[i]))
    						continue;
    					else {
    						int temp = asteroids[i];
    						while(!stack.isEmpty() &&stack.peek() > 0 && stack.peek() < (-temp)) 
    							stack.pop();
    						if(stack.isEmpty() || stack.peek() < 0) stack.push(temp);
    						else if(stack.peek() == (-temp)) stack.pop();
    					}
    			}
        		else stack.push(asteroids[i]);
        }
    
        int[] res = new int[stack.size()];
        for(int i = res.length - 1;i >= 0;i--)
    			res[i] = stack.pop();
    
        return res;
	}
}