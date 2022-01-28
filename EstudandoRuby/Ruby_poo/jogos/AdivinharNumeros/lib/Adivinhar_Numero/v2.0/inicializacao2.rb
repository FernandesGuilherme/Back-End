require 'tty-spiner'

class Inicializacao
def self.inicializando
	system('clear') # Comando do SO no ruby
	for i in 0 ... 5 
		print ("Iniciando.")
		sleep 1
		print(".") 
	end
		print(".\n")
		system('clear')
end

#system('clear') # Comando do SO no ruby
#		spinner = TTY::Spiner.new
#		spinner = TTY::Spinner.new("[:spinner] Loading ...", format: :pulse_2)
#		spinner.auto_spin # Automatic animation with default interval
#	sleep(2) # Perform task
#	spinner.stop("Done!") # Stop animation
#	end


	

