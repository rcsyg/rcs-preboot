package lv.accenture.preboot.collections;

public class AwesomeList {
	
	private int[] contents = new int[0];
	private int currentPosition = -1;
	
	public void add(int element) {
		if(contents.length == 0) {
			contents = new int[1];
			contents[0] = element;
			currentPosition = 0;
		} else {
			if(currentPosition < contents.length - 1) {
				//  If there is empty place in array
				currentPosition++;
				contents[currentPosition] = element;
			} else {
				// Creates new array with 2 times bigger capacity
				int[] newContents = new int[contents.length * 2];
				// Copy old contents to new array
				for (int i = 0; i < contents.length; i++) {
					newContents[i] = contents[i];
				}
				// Replace old array with new, bigger one
				contents = newContents;
				
				currentPosition++;
				contents[currentPosition] = element;
			}
		}
	}
	
	public int get(int index) {
		if (index < 0 || index > currentPosition) {
			throw new IllegalArgumentException("Illegal index! : " + index);
		} else {
			return contents[index];
		}
	}
	
	public void remove(int index) {
		for(int i = index; i < currentPosition; i++) {
			contents[i] = contents[i + 1];
		}
		currentPosition = currentPosition - 1;
	}
	
	public void printSelf() {
		for (int i = 0; i <= currentPosition; i++) {
			System.out.print(contents[i] + " ");
		}
	}
	
}
