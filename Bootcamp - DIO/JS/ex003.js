/*Faça um algoritmo que dado as 3 notas tiradas por um aluno em um semestre da faculdade, 
calcule e imprima a sua media e a sua classificacao conforma a tabela abaixo

// Classificação:
    Menor que 5 = reprovado
    Entre 5-7 = recuperação
    Acima 7 = aprovado
*/

const nota1 = 2
const nota2 = 4
const nota3 = 9
const media = (nota1 + nota2 + nota3) / 3

if (media < 5) {
    console.log(`Sua nota final foi de ${media.toFixed(2)} e você foi reprovado!`)
} else if (media < 7) {
    console.log(`Sua nota final foi de ${media.toFixed(2)} e você ficou de recuperação!`)
} else {
    console.log(`Sua nota final foi de ${media.toFixed(2)} e você foi aprovado!`)
}

