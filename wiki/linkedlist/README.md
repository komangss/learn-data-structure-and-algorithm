GNU nano 5.5                README.md
# Data Structure - LinkedList

Definition :
> LinkedList used to store objects in Sequence. but. unlike,arrays, linkedlist grow and shrink automaticaly.

**Declaration :**
| 10 | |  ->   | 20 | |  ->  | 30 | |
   NODE  link    NODE   link   NODE

A linkedlist have a node and inside the node has a value and link to the next node
the first node (10) in linkedlist called HEAD. the last node(30) of the linked list called TAIL

**Time Complexity :**
1. Lookup / get 
 - By Value = we have to traverse the list. start from the head Untill we found it. so its O(n)
 - By Index = again, we must traverss the list untill we find it because each node doesnt know each other, so its O(n)

2. Insert
 - In the first = O(1) we just need to link the new node to the last first node
 - In the middle = O(n) we need to find the middle of array
 - In the last = O(1) make the last node reference to the new node and change the reference to the new last nodr

3. Delete
 - In the first = O(1)
 - In the middle = O(n)
 - In the last = O(n)


