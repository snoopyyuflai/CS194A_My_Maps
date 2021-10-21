package edu.stanford.yuflai.hw2.models

import java.io.FileDescriptor
import java.io.Serializable

data class Place(val title: String, val description: String, val latitude: Double, val longitude: Double) : Serializable