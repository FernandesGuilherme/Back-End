class AddresController < ApplicationController
  before_action :set_addre, only: %i[ show edit update destroy ]

  # GET /addres or /addres.json
  def index
    @addres = Addre.all
  end

  # GET /addres/1 or /addres/1.json
  def show
  end

  # GET /addres/new
  def new
    @addre = Addre.new
  end

  # GET /addres/1/edit
  def edit
  end

  # POST /addres or /addres.json
  def create
    @addre = Addre.new(addre_params)

    respond_to do |format|
      if @addre.save
        format.html { redirect_to @addre, notice: "Addre was successfully created." }
        format.json { render :show, status: :created, location: @addre }
      else
        format.html { render :new, status: :unprocessable_entity }
        format.json { render json: @addre.errors, status: :unprocessable_entity }
      end
    end
  end

  # PATCH/PUT /addres/1 or /addres/1.json
  def update
    respond_to do |format|
      if @addre.update(addre_params)
        format.html { redirect_to @addre, notice: "Addre was successfully updated." }
        format.json { render :show, status: :ok, location: @addre }
      else
        format.html { render :edit, status: :unprocessable_entity }
        format.json { render json: @addre.errors, status: :unprocessable_entity }
      end
    end
  end

  # DELETE /addres/1 or /addres/1.json
  def destroy
    @addre.destroy
    respond_to do |format|
      format.html { redirect_to addres_url, notice: "Addre was successfully destroyed." }
      format.json { head :no_content }
    end
  end

  private
    # Use callbacks to share common setup or constraints between actions.
    def set_addre
      @addre = Addre.find(params[:id])
    end

    # Only allow a list of trusted parameters through.
    def addre_params
      params.require(:addre).permit(:street, :city, :state, :Contact_id)
    end
end
