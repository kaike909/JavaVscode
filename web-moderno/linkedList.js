function add(value){
    var n = node(value)
    if(head = null){
        head = n
        tail = n
    } else {
        tail.next = n
        tail = n
    }
}