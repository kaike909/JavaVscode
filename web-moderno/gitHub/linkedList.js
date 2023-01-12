class Node {
    constructor(data, next = null) {
        this.data = data;
        this.next = next;
    }
}
class LinkedList {
    constructor() {
        this.head = null;
        this.size = 0;
    }
    // inserir primeiro nó
    insertFisrt(data) {
        this.head = new Node(data, this.head);
        this.size++;
    }
    // inserir ultimo nó
    insertLast(data) {
        let node = new Node(data);
        let current;
        if (!this.head) {
            this.head = node;
        } else {
            current = this.head;
            while (current.next) {
                current = current.next;
            }
            current.next = node;
        }
        this.size++;
    }
    // inserir no index
    insertAt(data, index) {
        if (index > 0 && index > this.size) {
            return;
        }
        if (index === 0) {
            this.insertFisrt(data);
            // this.head = new Node(data, this.head);
            return;
        }
        const node = new Node(data);
        let current, previous
        current = this.head;
        let count = 0;
        while (count < index) {
            previous = current;
            count++;
            current = current.next;
        }
        node.next = current;
        previous.next = node;
        this.size++;
    }
    // Remover no Index
    removeAt(index) {
        if (index > 0 && index > this.size) {
            return;
        }
        let current = this.head;
        let previous;
        let count = 0;
        if (index === 0) {
            this.head = current.next;
        } else {
            while (count < index) {
                count++;
                previous = current;
                current = current.next;
            }
            previous.next = current.next;
        }
        this.size--;
    }
    // Get no Index
    getAt(index) {
        let current = this.head;
        let count = 0;
        while (current) {
            if (count == index) {
                console.log(`O valor ${current.data} esta no index ${index}`);
            }
            count++;
            current = current.next;
        }
        return null;
    }
    // limpar lista
    clearList() {
        this.head = null;
        this.size = 0;
    }
    // imprimir em lista
    printListData() {
        let current = this.head;
        while (current) {
            console.log(current.data)
            current = current.next
        }
    }
}
const ll = new LinkedList();
ll.insertFisrt(100)
ll.insertLast(200)
ll.insertLast(300)
ll.insertLast(400)
ll.insertAt(500, 2)
ll.printListData()
// ll.getAt(2)