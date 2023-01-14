function bhaskara(ax2, bx, c) {
    let delta = Math.pow(bx, 2) - 4 * ax2 * c
    if(delta < 0){
        console.log(`Delta nao possui raizes reais!`)
    } else {
        let b1 = (-bx + (Math.sqrt(delta)))/ (2 * ax2)
        let b2 = (-bx - (Math.sqrt(delta)))/ (2 * ax2)
        console.log(`x1 = ${b1} e x2 = ${b2}`)
    }
}

bhaskara(1, 4, 4)