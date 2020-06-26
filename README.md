# TallerSolid

2. En esta sección no se cumple el principio de inversión de dependencias ya que la clase OperacionesAderezo realizaba operaciones concretas para las clases Helado y Pastel cuando estas operaciones se pueden poner como metodos en la clase Postre.

3. En esta sección no se cumple el principio de segregación de Interfaces porque la clase Helado, Postre y Pastel poseen metodos no propios de su clase que no será usado, además de ser codigo repetido. Para cumplir el principio se deberia usar una interfaz aparte para relacionarlas.

5. En esta secciÃ³n no se cumple el principio de sustitucion de Liskov porque lechedescremada y lechedeslactosada no se comportan igual porque la leche deslactosada no se puede usar en pasteles en cambio la leche descremada si. La clase lecheEntera se encuentran metodos que pueden ser implementados con uno solo y se los implementa de acuerdo al tipo de postre.
