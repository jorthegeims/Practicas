void main() {

}

abstract class Animal {}

abstract class Mamifero extends Animal{}

abstract class Pez extends Animal{}

abstract class Ave extends Animal{}

mixin Volador {
  void volar() => print( "Estoy volando" );
}
mixin Caminante {
  void caminar() => print( "Estoy caminando" );
}
mixin Nadador {
  void nadar() => print( "Estoy nadando" );
}

class Delfin extends Mamifero with Nadador {}
class Murcielago extends Mamifero with Volador,Caminante {}
class Gato extends Mamifero with Caminante {}

class Paloma extends Mamifero with Volador,Caminante {}
class Pato extends Mamifero with Volador,Caminante,Nadador {}

class Tiburon extends Mamifero with Nadador {}
class PezVolador extends Mamifero with Volador,Nadador {}
