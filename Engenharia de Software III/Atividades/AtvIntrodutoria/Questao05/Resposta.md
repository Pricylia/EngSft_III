A teoria do DIP diz que:

High-level modules should not depend on low-level modules. Both should depend on abstractions. Abstractions should not depend on details. Details should depend on abstractions.

Módulos de alto nível não devem depender de módulos de baixo nível. Ambos devem depender de abstrações. Abstrações não devem depender de detalhes. Detalhes devem depender de abstrações.

Benefícios:

Esse princípio se preocupa principalmente com a redução de dependências entre os módulos de código. Podemos pensar nisso como precisar dos objetos de baixo nível para definir contratos que os objetos de alto nível podem usar, sem que os objetos de alto nível precisem se preocupar com a implementação específica que os objetos de baixo nível fornecem.
