class CreateAddres < ActiveRecord::Migration[6.0]
  def change
    create_table :addres do |t|
      t.string :street
      t.string :city
      t.string :state
      t.references :Contact, null: false, foreign_key: true

      t.timestamps
    end
  end
end
