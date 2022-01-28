require_relative "Pessoa.rb"
class PessoaFisica < Pessoa
    attr_accessor :CPF
    attr_accessor :data_nascimento
end
