package contract

import entity.input.InputFile

sealed interface IDocument {

    class InputFileDocument(val inputFile: InputFile) : IDocument

    class InputFileString(val value: String) : IDocument

    companion object {
        fun fromInputFile(inputFile: InputFile) = InputFileDocument(inputFile)
        fun fromString(string: String) = InputFileString(string)
    }
}