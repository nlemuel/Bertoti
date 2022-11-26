## Objetivo
Famílias de algoritmos implementados por uma hierarquia de classes onde os objetos dessas classes são utilizados em objetos de classes clientes por meio de composição, permitindo assim a mudança de comportamento dos objetos clientes pela intercambiação de objetos de estratégia.
## Aplicabilidade
o polimorfismo por meio de herança nem sempre é a melhor escolha para termos um código mais flexível e passível a evolução.
Nesses casos o padrão Strategy é uma excelente opção de modelo de código a ser utilizado. Com o padrão Strategy, como acontece com outros padrões de projeto, vamos estar implementando alguns princípios de orientação a objetos.
## Consequências
O número de classes no projeto pode crescer consideravelmente se houverem muitas funcionalidades que não podem ser implementadas por classes de uma mesma família de classes Strategy;
Pode complicar o projeto ainda mais caso uma solução com herança seja mais simples de implementar e manter.

## Diagramas
### Pattern
<div align = 'center'>
<img src = "https://user-images.githubusercontent.com/53242511/204067971-8ef623b8-1de1-4459-8032-3a7fe76fb468.png" width = '700px' />
</div>

### Antipattern
<div align = 'center'>
<img src = "https://user-images.githubusercontent.com/53242511/204067996-f6be0772-3c28-40b6-b2bb-08e86bd7a533.png" width = '700px' />
</div>
