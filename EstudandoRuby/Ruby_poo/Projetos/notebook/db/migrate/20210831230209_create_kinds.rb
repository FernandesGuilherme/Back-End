class CreateKinds < ActiveRecord::Migration[6.0]
  def change
    create_table :kinds do |t|
      t.string :description

      t.timestamps #Create_at, update_at - Cria no banco duas tabelas com informações de atualização e criação
    end
  end
end
