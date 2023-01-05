const a = {nome: 'Teste'}
const b = a
console.log(a.nome)
console.log(b.nome)
b.nome = 'Opa'
console.log(b.nome)

let c = 3
console.log(c)
let d = c
console.log(d)
d++
console.log(d)
console.log(c)