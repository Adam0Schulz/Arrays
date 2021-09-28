import java.util.*;

public class Run {
	public static void main(String[] args) {
		// 1: Create 4 person objects.
		// person 1: Jens, 175 cm, 69 kg.
		// person 2: Helle, 168 cm, 58 kg
		// person 3: Berit, 163 cm, 72 kg
		// person 4: Allan, 192 cm, 95 kg

		Person person1 = new Person("Jens", 175, 69);
		Person person2 = new Person("Helle", 168, 58);
		Person person3 = new Person("Berit", 163, 72);
		Person person4 = new Person("Allan", 192, 95);

		// 2: Create a Person array with 4 positions.
		// Populate the array with the 4 person objects

		Person[] persons = new Person[4];
		persons[0] = person1;
		persons[1] = person2;
		persons[2] = person3;
		persons[3] = person4;

		// 3: Using System.out.println(), print out the names and heights and weights of
		// the 4 people.
		// Note: It must work without modification if you changed the size of the array
		// and the number of
		// person objects in it.

		for (Person person : persons) {
			System.out.println(person.getName() + " " + person.getHeight() + " " + person.getWeight());
		}

		System.out.println(HeightOf("Jens", persons));
		System.out.println(tallestPerson(persons).getHeight());
		System.out.println(firstHeavierThanHigh(100, 100, persons).getName());
		System.out.println(tallestPerson(persons).getHeight());

	}

	// 4: Write a static method that returns the height of the specified name. The
	// specified name
	// is sent to the method as a parameter. The Person array to search in is also
	// sent as a parameter.
	// If the specified name does not exist in the array, the method should return
	// 0.

	public static int HeightOf(String name, Person[] array) {

		for (Person person : array) {
			if (person.getName() == name) {
				return person.getHeight();
			}

		}
		return 0;
	}

	// 5: Write a static method that returns the tallest person object in a given
	// person array.
	// The method must take in a person array as a parameter.
	// The method should return null if the array is empty. (no people objects in
	// it).

	public static Person tallestPerson(Person[] array) {

		if (array.length == 0) {
			return null;
		}

		int tallestHeight = 0;
		Person tallestPerson = array[0];
		for (Person person : array) {
			if (person.getHeight() > tallestHeight) {
				tallestHeight = person.getHeight();
				tallestPerson = person;
			}
		}

		return tallestPerson;
	}

	// 6: write a static method that returns the first person object in the array,
	// that weighs more and is taller than x and y.
	// x and y should be parameters to the method and the person array to search in
	// as well.
	// The method should return null if the array is empty. (no people objects in
	// it).

	public static Person firstHeavierThanHigh(int x, int y, Person[] array) {

		if (array.length == 0) {
			return null;
		}

		for (Person person : array) {
			if (person.getWeight() > x) {
				if (person.getHeight() > y) {
					return person;
				}
			}
		}

		return null;
	}

	// 7: write a method like the one above, but this time do not return only the
	// first person object that fits the criteria.
	// Instead return all objects that fits the criteria. The method must work also
	// if you changed the array and number of
	// people in it.

	public static ArrayList<Person> heavierThanHigh(int x, int y, Person[] array) {

		if (array.length == 0) {
			return null;
		}

		ArrayList<Person> rightPersons = new ArrayList<Person>();
		for (Person person : array) {
			if (person.getWeight() > x) {
				if (person.getHeight() > y) {
					rightPersons.add(person);
				}
			}
		}

		return rightPersons;
	}

}