void main() {
  final mySquare = Square(side:10);
  
  print( mySquare.area);
}


class Square {
  
  double _side;
  
  Square ({required side})
    : assert(side >=0,"tamaño menor a 0"),
     _side=side;
  
  set side (double valor){
    if(valor < 0) throw "valor inferior a 0";
    _side = valor;
  }
  
  double  get area{
    return _side*_side;
  }
  
  double calcularArea(){
    
    return _side*_side;
  }
  
}