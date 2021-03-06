	package treesAndGraphs;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Find size of complete binary tree
 * Find left and right height
 * if its equal, then (2<<h-1)-1 else use recursive calls
 * @author Devashri
 *
 */
public class SizeOfTree {

	 public int countNodes(TreeNode root) {
	        if(root==null){
	            return 0;
	        }
	        
	        int leftHeight = leftHeight(root)+1;
	        int rightHeight = rightHeight(root)+1;
	        if(leftHeight==rightHeight){
	            return (2<<(leftHeight-1))-1;
	        }else{
	            return (countNodes(root.leftChild)+1+countNodes(root.rightChild));
	        }
	    }
	    
	    public int rightHeight(TreeNode node){
	        
	        int count = 0;
	        if(node==null){
	            return count;
	        }
	        
	        TreeNode temp = node;
	        while(temp.rightChild!=null){
	            count++;
	            temp=temp.rightChild;
	        }
	        
	        return count;
	    }
	    
	    public int leftHeight(TreeNode node){
	        
	        int count = 0;
	        if(node==null){
	            return count;
	        }
	        TreeNode temp = node;
	        while(temp.leftChild!=null){
	            count++;
	            temp=temp.leftChild;
	        }
	        
	        return count;
	    }
	
	    
	    public static int countNodesIterative(TreeNode node){
	    	int count = 0;
	    	if(node == null){
	    		return count;
	    	}
	    	
	    	Queue<TreeNode> queue =new LinkedList<TreeNode>();
	    	queue.add(node);
	    	
	    	while(!queue.isEmpty()){
	    		TreeNode temp = queue.remove();
	    		if(temp.leftChild!=null){
	    			queue.add(temp.leftChild);
	    		}
	    		if(temp.rightChild!=null){
	    			queue.add(temp.rightChild);
	    		}
	    		count++;
	    	}
	    	return count;
	    }
	
	
	    
	    
	
}

