package week7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class Problem1 {

	public static void main(String[] args) throws IOException {
		InputStreamReader input_stream = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(input_stream);
		String text = reader.readLine();
		Boolean success = true;
		int offending_position = 1;

		Stack<Bracket> opening_brackets_stack = new Stack<Bracket>();
		for (int position = 0; position < text.length(); ++position) {
			char next = text.charAt(position);

			if (next == '(' || next == '[' || next == '{') {
				// Process opening bracket, write your code here
				opening_brackets_stack.push(new Bracket(next, position));
			}

			if (next == ')' || next == ']' || next == '}') {
				// Process closing bracket, write your code here
				if (opening_brackets_stack.empty()) {
					offending_position = position + 1;
					success = false;
					break;
				}

				Bracket opening_bracket = opening_brackets_stack.pop();
				if (!opening_bracket.Match(next)) {
					offending_position = position + 1;
					success = false;
					break;
				}
			}
		}
		if (!opening_brackets_stack.empty() || !success) {

			if (!success) {
				System.out.println(offending_position);
			} else {
				System.out.println(opening_brackets_stack.pop().position + 1);
			}
		}

		else
			System.out.println("Success");

	}
}

class Bracket {
	Bracket(char type, int position) {
		this.type = type;
		this.position = position;
	}

	boolean Match(char c) {
		if (this.type == '[' && c == ']')
			return true;
		if (this.type == '{' && c == '}')
			return true;
		if (this.type == '(' && c == ')')
			return true;
		return false;
	}

	char type;
	int position;
}
