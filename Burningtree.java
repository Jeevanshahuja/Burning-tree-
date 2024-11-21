import java.util.*;
public class Burningtree
{
    class Node {
    	int data;
    	Node left;
    	Node right;
    
    	Node(int data) {
    		this.data = data;
    		left = null;
    		right = null;
    	}
    }
    
    public static int minTime(Node root, int target) 
    {
        Map <Node , Node > track = new HashMap<>();
        parent(root,track);
        Map<Node,Boolean> visited = new HashMap<>();
        Queue<Node> q = new LinkedList<>();
        Node k=DFS(root,target);
        q.offer(k);
        visited.put(k,true);
        int time=0;
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                Node node = q.poll();
                if(node.left!=null && visited.get(node.left)==null){
                    visited.put(node.left,true);
                    q.offer(node.left);
                }
                if(node.right!=null && visited.get(node.right)==null){
                    visited.put(node.right,true);
                    q.offer(node.right);
                }
                if(track.get(node)!=null && visited.get(track.get(node))==null){
                    visited.put(track.get(node),true);
                    q.offer(track.get(node));
                }
            }
            time++;
        }
        return time-1;
    }
    public static void parent(Node root , Map track){
        Queue <Node> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                Node node = q.poll();
                if(node.left!=null){
                    track.put(node.left,node);
                    q.offer(node.left);
                }
                if(node.right!=null){
                    track.put(node.right,node);
                    q.offer(node.right);
                }
            }
        }
    }
    public static Node DFS(Node root, int target){
        if(root==null){
            return null;
        }
        if(root.data==target){
            return root;
        }
        Node right=DFS(root.right,target);
        if(right!=null){
            return right;
        }
        return DFS(root.left,target);
    }
}
