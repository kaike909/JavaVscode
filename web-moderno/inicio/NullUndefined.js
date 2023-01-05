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

let valor
console.log(valor)
valor = null
console.log(valor)

const produto ={}
console.log(produto.preco)

produto.preco = 3.5
console.log(produto.preco.toFixed(2))

produto.preco = undefined
console.log(!!produto.preco)
// delete produto.preco
console.log(produto)

produto.preco = null