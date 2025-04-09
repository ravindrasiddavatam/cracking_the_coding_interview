package Stack;

import java.util.Stack;

public class SimplifyPath {
	
	public String simplifyPath(String path) {
		String[] parts = path.split("/");
		Stack<String> stack = new Stack<>();
		for(String part:parts) {
			System.out.println("part: '" + part + "'");
			if(part.equals("") || part.equals(".")) {
				continue;
			}else if (part.equals("..")) {
				if(!stack.isEmpty()) {
					stack.pop();
				}
			}else {
				stack.push(part);
			}
		}
		System.out.println("Stack after processing: " + stack);
		
		//Build the simplified path
		StringBuilder simplifiedPath = new StringBuilder();
		for(String dir: stack) {
			simplifiedPath.append("/").append(dir);
		}
		return simplifiedPath.length()>0 ? simplifiedPath.toString() : "/";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimplifyPath s = new SimplifyPath();
		System.out.println(s.simplifyPath("/home/user/../Documents/./pics"));
	}

}
