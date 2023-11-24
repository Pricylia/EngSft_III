Explique por que motivo a herança entre as classes não é justificada e proponha uma solução.

 A classe derivada ContaPoupanca sobrescreve o método sacar, adicionando uma verificação específica para limitar o saque a 1000 unidades. Isso quebra o princípio de substituição de Liskov, pois o comportamento da classe derivada difere do comportamento esperado da classe base.