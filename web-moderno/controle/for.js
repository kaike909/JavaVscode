const pontinhos = a => console.log(`${'-'.repeat(10)} ${a} ${'-'.repeat(10)}`)
pontinhos('For 1!')

let contador = 1
while(contador <= 10 ){
    console.log(`Contador = ${contador}`)
    contador++
}

for(let i = 1; i <= 10;i++){
    console.log(`i = ${i}`)
}

const notas = [6.7, 7.4, 9.8, 8.1, 7.7]

for (let i = 0; i < notas.length;i++){
    console.log(`nota ${i + 1} = ${notas[i]}`)
}

pontinhos('For 2!')

for (let i in notas){
    console.log(i, notas[i])
}

const pessoa = {
    nome: 'Ana',
    sobrenome: 'Silva',
    idade: 29,
    peso: 65
}

for (let i in pessoa){
    console.log(`${i} = ${pessoa[i]}`)
}