import br.com.petshop.animal.Animal;
import br.com.petshop.documento.Documento;
import br.com.petshop.pessoa.Pessoa;
import br.com.petshop.pessoa.PessoaFisica;
import br.com.petshop.pessoa.PessoaJuridica;
import br.com.petshop.servico.Servico;
import br.com.petshop.sexo.Sexo;

public class Main {

    public static PessoaFisica novaPessoa(Long id, String nome, String cpf ,Sexo sexo){
        PessoaFisica pf = new PessoaFisica();
        pf.setId(id);
        pf.setNome(nome);
        pf.setCpf(cpf);
        pf.setSexo(sexo);
        return pf;
    }

    public static PessoaJuridica novaPessoaJuridica(Long id, String nome, String cnpj ){
        PessoaJuridica pj = new PessoaJuridica();
        pj.setId(id);
        pj.setNome(nome);
        pj.setCnpj(cnpj);
        return pj;
    }


    public static Servico novoServico(int id, String nome, double valor, String descricao, String observacao, Animal animal){
        Servico serv = new Servico();
        serv.setId(id);
        serv.setNome(nome);
        serv.setValor(valor);
        serv.setDescricao(descricao);
        serv.setObservacao(observacao);
        serv.setAnimal(animal);
        return serv;
    }

    public static Documento novoDocumento(int id, String numero, Pessoa pessoa){
        Documento doc = new Documento();
        doc.setId(id);
        doc.setNumero(numero);
        doc.setPessoa(pessoa);
        return doc;
    }

    public static Animal novoAnimal(Long id, String nome, String raca, String descricao, String observacao, Pessoa dono){
        Animal animal = new Animal();
        animal.setId(id);
        animal.setNome(nome);
        animal.setRaca(raca);
        animal.setDescricao(descricao);
        animal.setObservacao(observacao);
        animal.setDono(dono);
        return animal;
    }
    public static void main(String[] args) {


    }
}