package Hashing;
import java.util.ArrayList;

public class Chaining {
	private final int bucket;
    // Hash table of size bucket
    private final ArrayList<Integer>[] table;

    public Chaining(int bucket)
    {
        this.bucket = bucket;
        this.table = new ArrayList[bucket];
        for (int i = 0; i < bucket; i++) {
            table[i] = new ArrayList<>();
        }
    }
    public int hashFunction(int key)
    {
        return (key % bucket);
    }

    public void insertItem(int key)
    {
        // get the hash index of key
        int index = hashFunction(key);
        // insert key into hash table at that index
        table[index].add(key);
    }

    public void deleteItem(int key)
    {
        // get the hash index of key
        int index = hashFunction(key);

        // Check if key is in hash table
        if (!table[index].contains(key)) {
            return;
        }

        // delete the key from hash table
        table[index].remove(Integer.valueOf(key));
    }
    public void displayHash()
    {
        for (int i = 0; i < bucket; i++) {
            System.out.print(i);
            for (int x : table[i]) {
                System.out.print(" --> " + x);
            }
            System.out.println();
        }
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 15, 11, 27, 8, 12 };

        // Create a empty has of BUCKET_SIZE
        Chaining h = new Chaining(7);

        // insert the keys into the hash table
        for (int x : a) {
            h.insertItem(x);
        }

        // delete 12 from the hash table
        h.deleteItem(12);

        // Display the hash table
        h.displayHash();

	}

}
