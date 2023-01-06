function compras(trab1, trab2){
    comprarSorvete = trab1 || trab2
    comprarTv50 = trab1 && trab2
    comprarTv32 = !!(trab1 ^ trab2)
    manterSaudavel = !comprarSorvete
    return {comprarSorvete, comprarTv50, comprarTv32, manterSaudavel}
}

console.log(compras(true, true))
console.log(compras(true, false))
console.log(compras(false, true))
console.log(compras(false, false))