package contract

import entity.input.InputFile

sealed interface IAudio {

    class InputFileAudio(val inputFile: InputFile) : IAudio

    class InputFileString(val value: String) : IAudio

    companion object {
        fun fromInputFile(inputFile: InputFile) = InputFileAudio(inputFile)
        fun fromString(string: String) = InputFileString(string)
    }
}