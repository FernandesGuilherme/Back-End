require "application_system_test_case"

class AddresTest < ApplicationSystemTestCase
  setup do
    @addre = addres(:one)
  end

  test "visiting the index" do
    visit addres_url
    assert_selector "h1", text: "Addres"
  end

  test "creating a Addre" do
    visit addres_url
    click_on "New Addre"

    fill_in "Contact", with: @addre.Contact_id
    fill_in "City", with: @addre.city
    fill_in "State", with: @addre.state
    fill_in "Street", with: @addre.street
    click_on "Create Addre"

    assert_text "Addre was successfully created"
    click_on "Back"
  end

  test "updating a Addre" do
    visit addres_url
    click_on "Edit", match: :first

    fill_in "Contact", with: @addre.Contact_id
    fill_in "City", with: @addre.city
    fill_in "State", with: @addre.state
    fill_in "Street", with: @addre.street
    click_on "Update Addre"

    assert_text "Addre was successfully updated"
    click_on "Back"
  end

  test "destroying a Addre" do
    visit addres_url
    page.accept_confirm do
      click_on "Destroy", match: :first
    end

    assert_text "Addre was successfully destroyed"
  end
end
