## Objetivo
Garantir uma única instanciação de uma classe, com um ponto de acesso único e global;
Motivação: Existem classes que apenas uma instância de um objeto é o ideal, por exemplo, em uma aplicação que precisa de uma infraestrutura de log de dados, pode-se implementar uma classe no padrão Singleton, já que o acesso ao arquivo de log é serializado e economizamos memória com apenas uma alocação.
## Aplicabilidade
Este padrão é muito utilizado para classes que precisamos de um único acesso global controlado ou que não temos porque criar várias instância, como um Logger, que irá afunilar o acesso ao arquivo de log. Ou mesmo em um sistema web que forneça itens para seus clientes vindos de uma fila.
## Consequências
Este padrão permite o controle sobre como e quando os clientes acessam a instância e várias classes singleton podem obedecer uma mesma interface, permitindo assim que um singleton em particular seja escolhido para trabalhar com uma determinada aplicação em tempo de execução.
Mas, usando Singleton você estará acoplando o seu código em uma implementação estática e específica e isso faz o seu código dependente dessa classe e impede, por exemplo, criar mocks em testes unitários. Em algumas linguagens, temos uma falsa segurança, como no java, onde por exemplo, não existe uma classe apenas por JVM. O conceito de carregamento de classes em java é feito por ClassLoader
## Diagrama
<div align = 'center'>
<img src = "https://user-images.githubusercontent.com/53242511/204067741-a30292c4-76e2-4be3-bdca-7fea207c225d.png" width = '400px' />
</div>
