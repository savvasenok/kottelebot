package contract

import entity.input.InputFile

sealed interface IVideo {

    class InputFileVideo(val inputFile: InputFile) : IVideo

    class InputFileString(val value: String) : IVideo

    companion object {
        fun fromInputFile(inputFile: InputFile) = InputFileVideo(inputFile)
        fun fromString(string: String) = InputFileString(string)
    }
}