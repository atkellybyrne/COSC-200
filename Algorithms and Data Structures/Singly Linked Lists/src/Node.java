
public class Node {
	
	private String name;
	private Node nxtPoint;
	
	public Node(String named) {
		name = named;
		nxtPoint = null;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String named) {
		name = named;
	}
	
	public Node getNode() {
		return nxtPoint;
	}
	
	public void setNext(Node nextPointer) {
		nxtPoint = nextPointer;
	}

}
