
public class Sort {
public static void main(String[] args) {
	
	int values[] = {2, 13, 67, 34, 12, 22, 56, 58, 42, 100, 87, 95, 48, 77, 84, 21};
	int maxval = 0;
	
	for (int i = 0; i < values.length; i++) {
		for (int j = i+1; j < values.length; j++) {
			if (values[i]<values[j]) {
				maxval = values[i];
				values[i]=values[j];
				values[j]=maxval;
			}
		}
		System.out.println(values[i]);
	}
	
}
	
	
}
