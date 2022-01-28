class CreateContacts < ActiveRecord::Migration[6.0]
  def change
    create_table :contacts do |t|
      t.string :name
      t.string :email
      t.references :Kind, null: false, foreign_key: true
      t.text :rmk #Campo para muito texto

      t.timestamps
    end
  end
end
