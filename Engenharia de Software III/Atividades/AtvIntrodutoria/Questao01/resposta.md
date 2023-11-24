A teoria do ISP diz que:

No client should be forced to depend on methods it does not use

Clientes de interface (classes) não deveriam ser forçadas a depender de métodos que não irão usar. Cada classe deve implementar somente o necessário, sem qualquer excesso.

Benefícios

O ISP tem como objetivo reduzir os objetos de código até a menor implementação possível e remover as dependências desnecessárias para o funcionamento. Em geral, o resultado da implementação desse princípio resulta em muitas interfaces pequenas e focadas, que definem apenas o que é necessário para suas implementações.