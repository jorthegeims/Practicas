void main() {
  
  Final Map<String, dynamic> pokemon = {
    
    "name" : "pikachu",
    
    "hp" : 100,
    
    "springs" : {
      1 : "front.png",
      2 : "back.png"
    }
      
  };
  
  print(pokemon);
  
  print("adelante = " + pokemon["springs"][1]);
  print("atras = " + pokemon["springs"][2]);
  
}
