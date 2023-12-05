public class HashTable {
        private Tree[] hashArray; // array of trees
        private int arraySize;
    
        public HashTable(int size) {
            arraySize = size;
            hashArray = new Tree[arraySize]; // create array
            for (int j = 0; j < arraySize; j++) // fill array
                hashArray[j] = new Tree();
        }
    
        public void displayTable() {
            for (int j = 0; j < arraySize; j++) {
                System.out.print(j + ". ");
                hashArray[j].print();
            }
        }
    
        public long hashFunc(long key) {
            return key % arraySize;
        }
    
        public void insert(Node theNode) {
            long key = theNode.data;
            long hashVal = hashFunc(key);
            hashArray[(int)hashVal].insert(theNode);
        }
    
        public void delete(long key) {
            long hashVal = hashFunc(key);
            hashArray[(int)hashVal].delete(key);
        }
    
        public Node find(long key) {
            long hashVal = hashFunc(key);
            return hashArray[(int)hashVal].find(key);
        }
    }

