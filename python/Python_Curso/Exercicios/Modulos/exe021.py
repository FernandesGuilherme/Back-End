#Faça um programa para dar play em um arquivo .mp3

import pygame.mixer
pygame.mixer.init()
pygame.init()
pygame.mixer.music.load('exe021.mp3')
pygame.mixer.music.play()
pygame.event.wait()


