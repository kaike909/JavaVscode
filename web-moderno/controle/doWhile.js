const pontinhos = a => console.log(`${'-'.repeat(10)} ${a} ${'-'.repeat(10)}`)

function imprimeResultado(min, max){
    const valor = Math.random() * (max - min) + min
    return Math.floor(valor)
}

let opcao = 0

do {
    opcao = imprimeResultado(-1, 10)
    console.log(`Opção escolhida foi ${opcao}`)
} while (opcao != -1);

pontinhos('Fim!')