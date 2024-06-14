internal class Program
{
    private static void Main(string[] args)
    {
        Console.WriteLine("Hello, World!");

        string path = "C:/Users/gabri/OneDrive/Escritorio/mobile/flutter/dart/practica/Lecturas/Ejercicio1.txt";

        try
        {
            using (StreamReader sr = new StreamReader(path))
            {
                string[] line;
                line = sr.ReadLine().Split(" ");


                int c = int.Parse(line[0]);//la cantidad de claros c
                int s = int.Parse(line[1]);//la cantidad s de senderos
                int d = int.Parse(line[2]);//la cantidad d de dragones

                line = sr.ReadLine().Split(" ");

                int cf = int.Parse(line[0]);//cf donde está la princesa
                int cm = int.Parse(line[1]);//cm donde está el príncipe

                line = sr.ReadLine().Split(" ");
                int i = 0;
                int[] dragones = new int[d];



                foreach (string item in line)
                {
                    dragones[i] = int.Parse(item);
                    i++;
                }



                i = 0;

                Sendero[] senderos = new Sendero[s];

                string lineE;


                while ((lineE = sr.ReadLine()) != null)
                {
                    line = lineE.Split(" ");
                    Console.WriteLine(lineE);

                    int sci=int.Parse(line[0]);
                    int scf=int.Parse(line[1]);
                    int sl=int.Parse(line[2]);

                    senderos[i] = new Sendero( sci, scf , sl );

                    if (true)
                    {
                        
                    }
                }
     
            }

        }
        catch (Exception ex)
        {
            Console.WriteLine($"Ocurrió un error: {ex.Message}");
        }
    }
}