package InputProcess;

import java.util.Stack;

public class QueryPerser {
    public String query;
    public Stack<String> stack;
    public String[] processedQuery;

    public QueryPerser(String query) {
        this.query = query;
        stack = new Stack<>();
        processedQuery = query.split(" ");
        perseQuery();
    }

    private void perseQuery() {
        stack.push("(");
        for(int i = 0; i < processedQuery.length; ++i) {
            String temp = processedQuery[i];
            if(temp.equals("(")) {
                stack.push(temp);
            }
            else if(temp.equals(")") && !stack.peek().equals("node")) { // "node" represents a node is created
                String output = "";
                while(!stack.peek().equals("(")) {
                    output = stack.pop() + " "+ output;
                }
                output = stack.pop() + " "+ output;

                if(!stack.peek().equals("node") && !stack.peek().equals("join")) {
                    // Need to create a new node and then push it
                }
                else {
                    // Push the old node
                }
            }
            else if(temp.equals(")") && stack.peek().equals("node")) { // "node" represents a node is created
                stack.pop();
                if(stack.peek().equals(";")) {
                    stack.pop(); // popping ;
                    stack.pop(); // popping node before ;
                    stack.pop(); // popping text before node
                    // Need to implement the rest of the file
                }
                else {
                    stack.pop(); // popping (
                    stack.pop(); // popping text before (
                    // Need to create a node and push it in the stack
                }
            }
            else if(temp.equals(";") && stack.peek().equals("node")) {
                stack.push(temp);
            }
            else {
                // To do list
            }
        }
    }

}
