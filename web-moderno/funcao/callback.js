const pontinhos = param => console.log(`${'-'.repeat(15)} ${param} ${'-'.repeat(15)}`)
pontinhos('Callback 1!')

const fabricantes = ['Mercedes', 'Audi', 'BMW']

function imprimir(nome, index) {
    console.log(`${index + 1}.${nome}`)
}

fabricantes.forEach(imprimir)
fabricantes.forEach(a => console.log(`${a}`))

pontinhos('Callback 2!')
const notas = [7.7, 6.5, 5.2, 8.9, 3.6, 7.1, 9.0]

let notasBaixas = []

for (let i in notas) {
    if (notas[i] < 7) {
        notasBaixas.push(notas[i])
    }
}

let notasAltas = []

for (let i in notas) {
    if (notas[i] >= 7) {
        notasAltas.push(notas[i])
    }
}

notasBaixas = notas.filter(n => n < 7)
notasAltas = notas.filter(n => n >= 7)

console.log(notasBaixas)
console.log(notasAltas)

const notasMenorQue7 = n => n < 7
const notasMaiorQue7 = n => n >= 7
const notasBaixas2 = notas.filter(notasMenorQue7)
const notasAltas2 = notas.filter(notasMaiorQue7)

console.log(notasBaixas2)
console.log(notasAltas2)

pontinhos('Callback 3!')

// Exemplo de callback no navegador
document.getElementsByTagName('body')[0].onclick = function(e) {
    console.log('O evento ocorreu!')
}