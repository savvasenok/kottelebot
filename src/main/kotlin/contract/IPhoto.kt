package contract

import entity.input.InputFile

sealed interface IPhoto {

    class InputFilePhoto(val inputFile: InputFile) : IPhoto

    class InputFileString(val value: String) : IPhoto

    companion object {
        fun fromInputFile(inputFile: InputFile) = InputFilePhoto(inputFile)
        fun fromString(string: String) = InputFileString(string)
    }
}