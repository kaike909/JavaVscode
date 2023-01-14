function getTriangulo(x, y, z){
    if (x == y &&  y == z){
        console.log('É um triângullo Equilátero!')
    } else if (x == y || x == z || y == z){
        console.log('É um triângullo Isosceles!')
    } else {
        console.log('É um triângullo Escaleno!')
    }
}

getTriangulo(2, 2, 2)
getTriangulo(2, 2, 3)
getTriangulo(2, 3, 4)