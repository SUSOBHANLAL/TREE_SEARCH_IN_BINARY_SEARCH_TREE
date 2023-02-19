package search_in_binary_tree;
class node{
	int key;
	node left;
	node right;
	node(int key){
		this.key= key;
			left=null;
			right = null;
	}
}
public class susobhan {
	public static void main(String args[]) {
		node root = new node(15);
		root.left=new node(5);
    	root.left.left=new node(3);
    	root.right=new node(20);
    	root.right.left=new node(18);
    	root.right.left.left=new node(16);
    	root.right.right=new node(80);
    	int x = 16;
    	
    	
    	
    	if(searchnode(root,x)==true){
    		System.out.print("haa it is present");
    	}
    	else {
    		System.out.print("haa it is not present");
    	}
	}
		static boolean searchnode(node root,int x) {
			if(root==null) {
				return false;
				
			}
			else if(root.key==x) {
				return true;
			}
			else if(root.key<x) {
				return searchnode(root.right,x);
			}
			else  {
				return searchnode(root.left,x);
			}
			
			
		}
	

}
