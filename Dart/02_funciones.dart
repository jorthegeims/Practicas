void main() {
  print ("resta 10 - 0 = ${resta(10)}");
  print ("suma 1 + 2 = ${suma(1, 2)}");
}

int suma (int a, [int b = 0]) => a + b;

int resta (int a, [int? b]) { 
  
  b??=0;
 return a - b;
  
}