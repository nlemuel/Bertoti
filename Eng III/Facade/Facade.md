## Objetivo: 
Simplificar o uso de processos mais complexos e / ou que envolvam vários sub-sistemas em uma interface simples;
Motivação: Quando temos diversos sub-sistemas e / ou processos mais complexos e longos, fazer com que cada cliente precise fazer as devidas chamadas a cada “pedaço” do processo acaba tornando nosso sistema mais complexo de manter. Com o uso de uma interface simples,
## Aplicabilidade:
O padrão Facade é bastante utilizado quando queremos tornar nosso sistema mais fácil de manter, com menor acoplamento e dependência entre os N sistemas que temos com os clients. Um uso muito comum é a criação de Services, utilizando o modelo de um Facade, onde agrupamos o uso de repositories, gateways, etc., através de uma chamada e resposta simples a um método de interface.
## Consequências:
O pattern Facade auxilia muito isolando a complexidade em operações grandes ou que utilizam muitos sub-sistemas ou componentes diferentes de nossa aplicação, mas precisamos tomar muito cuidado, pois o mau uso pode acabar na criação de um “Facade Severino”, que acaba acumulando responsabilidades demais, quebranco o princípio de responsabilidade única. Em nosso exemplo, a função dele é inserir uma venda, sendo responsável pelos itens e atualização do estoque. A atualização do estoque em si já acaba sendo uma responsabilidade extra, que por boas práticas, deve ser colocada em outra Facade, assim como emitir notas, enviar o pedido por email, cada um para uma Facade diferente, evitando que o objeto torne-se impossível de manter.

## Diagrama 
<div align = 'center'>
![Facade](https://user-images.githubusercontent.com/53242511/204067124-ca4b7751-81bc-454a-ba26-b9b4280eca5c.png)
</div>
