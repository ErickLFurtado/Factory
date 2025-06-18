---

# 🏭 Padrão de Projeto: Factory Method

## 📌 Introdução: O que são os padrões de projetos

Padrões de projeto (design patterns) são soluções reutilizáveis para problemas recorrentes no desenvolvimento de software. Eles representam boas práticas adotadas por desenvolvedores experientes e ajudam a tornar o código mais compreensível, reutilizável e fácil de manter.

Esses padrões não são pedaços de código prontos para serem copiados e colados, mas sim estruturas e ideias que guiam a implementação de soluções. Existem diversas categorias, como **padrões criacionais**, **estruturais** e **comportamentais**.

O padrão **Factory Method** se encaixa na categoria dos padrões **criacionais**, pois lida com a criação de objetos.

---

## 🏗️ Factory Method: O que é

O padrão **Factory Method** define uma **interface** para criar um objeto, mas permite que as **subclasses decidam qual classe instanciar**. Ele delega para subclasses a responsabilidade de instanciar objetos, promovendo maior flexibilidade e desacoplamento entre as classes.

É útil quando a criação de objetos precisa ser controlada ou adaptada em tempo de execução, sem acoplar o código diretamente a classes concretas.

---

## ✅ Vantagens

* Promove o **princípio do aberto/fechado** (Open/Closed Principle): você pode adicionar novas implementações sem modificar o código existente.
* Facilita a manutenção e a **extensão do código**.
* Permite **criar objetos de forma flexível**, em tempo de execução.
* Reduz o acoplamento entre a lógica de criação e uso do objeto.

---

## ❌ Desvantagens

* Pode aumentar a complexidade do código.
* Pode gerar muitas classes se não for bem planejado.
* Exige mais esforço inicial para implementar do que instanciar diretamente.

---

## 💡 Formas utilizadas no código

### 1. 💸 Processador de pagamentos

Neste exemplo, uma interface define o produto, e o método de fábrica é implementado por subclasses para criar objetos específicos.

Interface:
```Java
package com.ex;

public interface PaymentProcessor {

    void processPayment(double value);

    boolean validate();
}
```

Uso:

```Java
package com.ex;

public class PaymentFactory {
    public PaymentProcessor paymentType (String type){
        type.toUpperCase();
        if (type == "CARD"){
            return new CardPayment();
        }
        if (type == "PIX"){
            return new PixPayment();
        }
        if (type == "TICKET"){
            return new TicketPayment();
        }
        else {
            throw new IllegalArgumentException();
        }
    }
}
```
Nota-se que dentro da nossa factory há as intancias do nosso produto/tipo de pagamento!

### ❓. Curiosidade: 
Dentro da propria jdk (Java development Kit) podemos encontrar alguns metodos Factory, dentre eles o metodo Calendar.

```Java
public static Calendar getInstance() {
    // Pode retornar diferentes implementações:
    if (locale.equals("th_TH")) {
        return new BuddhistCalendar(); // Calendário budista
    } else if (locale.equals("ja_JP")) {
        return new JapaneseImperialCalendar(); // Calendário japonês
    } else {
        return new GregorianCalendar(); // Calendário gregoriano (padrão)
    }
}
```

por padrão o Calendario gregoriano é executado, mas devido ao factory, podemos direcionar a instanciação para outro tipo de calendario!
---


---

### 3. 🧵 Aplicação em ambiente extensível

Ideal quando se deseja permitir que novos tipos de produtos sejam adicionados sem alterar a lógica de criação existente, bastando adicionar uma nova subclasse.

---

## 📢 Importante:

O padrão Factory Method **não instancia diretamente os objetos**, mas **delega essa responsabilidade para classes filhas**, aumentando a flexibilidade do sistema.

Ele é ideal quando:

* Há necessidade de generalizar a criação de objetos.
* Deseja-se **desacoplar a lógica de criação da lógica de uso**.
* O sistema precisa ser **extensível** com novos produtos no futuro.

---
