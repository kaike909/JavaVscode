function boletim(codAluno, n1, n2, n3) {
    let notas = []
    notas.push(n1)
    notas.push(n2)
    notas.push(n3)
    notas.sort((a, b) => a < b ? 1 : -1)

    let media = (notas[0] * 4 + notas[1] * 3 + notas[2] * 3) / 10
    console.log(`Codigo do Aluno: ${codAluno}.\nNotas: ${n1}, ${n2}, ${n3}.\nMedia: ${media > 5 ? 'Aprovado' : 'Reprovado' }`)
}

boletim(123, 3.2, 2.1, 8.7)