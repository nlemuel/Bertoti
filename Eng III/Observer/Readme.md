## Objetivo
A definição formal do Padrão Observer é: “O Padrão Observer define uma dependência um-para-muitos entre os objetos de modo que quando um objeto muda de estado, todos os seus dependentes são notificados e atualizados automaticamente”.

## Aplicabilidade
O Observer é útil quando precisamos que dois ou mais objetos "escutem" a determinados eventos em um outro objeto. Os objetos que estão escutando são conhecidos como Observers e o objeto que é escutado (ou observado) é conhecido como Subject.

## Consequências
Se a implementação for encadeada, por exemplo: um Observer é também um Subject (algo possível). Se esse tipo de encadeamento acontecer de forma descontrolada o vazamento de memória será um provável problema. Mais precisamente, OutOfMemoryException;
Outra problemática é quando seu código tem somente um observador e um sujeito, em qualquer circunstância. Implementar o Observer nesse cenário é tornar o código inflado com a aplicação desnecessária de um padrão.

## Diagrama
<div align = 'center'>
<img src = "https://user-images.githubusercontent.com/53242511/204067623-15c4f0be-bfd1-49e1-b6b8-175e53fd3599.png" width = '700px' />
</div>
