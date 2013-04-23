#!/usr/bin/perl
use Digest::SHA qw(sha256);
print unpack("H*", sha256("Enter values" . " here")), "\n";
