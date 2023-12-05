
    import java.io.*;

    public class BSTChain {
        public static void main(String[] args) throws IOException {
            long aKey;
            Node aDataItem;
            int size, n, keysPerCell = 100;
    
            System.out.print("Enter size of the hash table: ");
            size = getInt();
            System.out.print("Enter the initial number of items: ");
            n = getInt();
    
            HashTable myHashTable = new HashTable(size);
    
            for (int j = 0; j < n; j++) {
                aKey = (long) (Math.random() * keysPerCell * size);
                aDataItem = new Node((char) (j + 65), aKey); // You can use any character as the node id
                myHashTable.insert(aDataItem);
            }
    
            while (true) {
                System.out.print("Enter first letter of ");
                System.out.print("show, insert, delete, or find: ");
                char choice = getChar();
                switch (choice) {
                    case 's':
                        myHashTable.displayTable();
                        break;
                    case 'i':
                        System.out.print("Enter key value to insert: ");
                        aKey = getInt();
                        aDataItem = new Node('A', aKey); // You can use any character as the node id
                        myHashTable.insert(aDataItem);
                        break;
                    case 'd':
                        System.out.print("Enter key value to delete: ");
                        aKey = getInt();
                        myHashTable.delete(aKey);
                        System.out.println("Successfully deleted");
                        break;
                    case 'f':
                        System.out.print("Enter key value to find: ");
                        aKey = getInt();
                        aDataItem = myHashTable.find(aKey);
                        if (aDataItem != null)
                            System.out.println("Found " + aDataItem.data);
                        else
                            System.out.println("Could not find " + aKey);
                        break;
                    default:
                        System.out.print("Invalid entry\n");
                }
            }
        }
    
        public static String getString() throws IOException {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String s = br.readLine();
            return s;
        }
    
        public static char getChar() throws IOException {
            String s = getString();
            return s.charAt(0);
        }
    
        public static int getInt() throws IOException {
            String s = getString();
            return Integer.parseInt(s);
        }
    }
    
    
     

