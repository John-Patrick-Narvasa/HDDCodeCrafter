  # Data Structures:

prompts:
make a seperated java code snippet of each data structures mentioned below (revolving around a one comprehensible example): (make comments what their purpose serves with the theoretical explanation and contextual explanation according to the example)

make a combined java code program of using each data structures mentioned below (revolving around a one comprehensible example): (make comments what their purpose serves with the theoretical explanation and contextual explanation according to the example)

1. Arrays
2. Linked
3. HashMaps
4. Stacks (LIFO)
5. Queues (FIFO)
6. Trees
7. Binary Trees

Arrays:
- Read: O(1)
- Insertion: O(n)
- Deletion: O(n)
- Fast at reading but slow at insertion and deletion.

Linked Lists:
- Read: O(n)
- Insertion: O(1)
- Deletion: O(1)
- Slow at reading but efficient for insertion and deletion.

HashMaps:
- Read: O(1)
- Insertion: O(1)
- Deletion: O(1)
- Similar to arrays but with named indexes (keys); unordered but provide fast lookup.

Stacks:
- Push: O(1)
- Pop: O(1)
- Peak: O(1)
- Follow the LIFO (Last In, First Out) principle; useful for fast retrieval of the topmost element but can be cumbersome for inserting or deleting elements in the middle or end.

Queues:
- Enqueue: O(1)
- Dequeue: O(1)
- Front: O(1)
- Follow the FIFO (First In, First Out) principle; the first element in line is the first to come out. Think of them as playlists for organizing items in order of arrival.

Trees:
- Read/Search: O(log n)
- Insertion: O(log n)
- Deletion: O(log n)
- Nodes connected by edges; root, parent-child connections.

Binary Trees:
- Efficient searching of ordered values.
- Follow a binary search property where left child nodes are less than the parent and right child nodes are greater.
- Useful for tasks like number guessing games or dictionary implementations.

Graphs:
- Traversal/Search: O(V + E) (V: number of vertices, E: number of edges)
- Insertion: O(1)
- Deletion: O(1)
- Versatile models for connections between nodes and edges; can be directed or undirected with no neighboring limit. Can include cycles and weights on paths. Used for tasks like route optimization.
