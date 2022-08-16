import { Estado } from "./estado";
import { Pais } from "./pais";

export interface Pessoas
{
  id: number,
  nome: string,
  sobrenome: string,
  idade: number,
  pais: Pais,
  estado: Estado
}
