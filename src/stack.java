public class stack {
    // Private attributes
    private static final int TAM_DEFAULT = 100;
    private	int topoStack;
    private	char e[ ];
    // Public methods
    public	stack(int tamanho) {  // construtor 1
        this.e = new char [tamanho];
        this.topoStack = -1;
    }

    public	stack() {// construtor 2
        this(TAM_DEFAULT);
    }


    //Check if the stack is empty
    public boolean isEmpty() {
        if (this.topoStack == -1)
            return true;
        else
            return false;
    }
    // Check if the stack is full
    public boolean isFull() {
        if (this.topoStack == this.e.length-1)
            return true;
        else
            return false;
    }
    // Insert an element on top of the stack
    public void push(char e) {
        if (! this.isFull( ))
            this.e[++this.topoStack] = e;
        else
            System.out.println("overflow - Stack's full");
    }
    //Removes an element from the top of the stack
    public char pop() {
        if (! this.isEmpty( ))
            return this.e[this.topoStack--];
        else{
            System.out.println( "underflow - Stack's empty");
            return '\0';
        }
    }
    //Returns the element from the top of the stack
    public char topo() {
        if ( ! this.isEmpty( ))
            return this.e[this.topoStack];
        else{
            System.out.println("Underlow - Stack's empty");
            return '\0';
        }
    }
    // Obtain the total of elements stored int the stack
    public int sizeElements() {
        return topoStack+1;
    }

}

