require 'digest/sha2'
print Digest::SHA2.new(256) << "Enter values" + " here"
