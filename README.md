# Burning Tree Problem  

Given a binary tree and a node value called `target`, the task is to find the minimum time required to burn the entire binary tree if the target node is set on fire. The fire spreads in 1 second to all connected nodes (left child, right child, and parent).  

## Function Usage  

### Function: `minTime(Node root, int target)`  
- **Purpose**: Calculates the minimum time required to burn the entire tree starting from the target node.  
- **Input**:  
  - `Node root`: The root of the binary tree.  
  - `int target`: The value of the node where the fire starts.  
- **Output**: Returns the minimum time (in seconds) required to burn the tree.

## Time Complexity  
- **Time Complexity**: `O(N)`, where `N` is the number of nodes in the binary tree.  
- **Space Complexity**: `O(N)` for auxiliary data structures like the queue and parent map.  

For more details, visit the [GeeksforGeeks Problem Statement]([https://www.geeksforgeeks.org/problems/burning-tree/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=burning-tree]).  
