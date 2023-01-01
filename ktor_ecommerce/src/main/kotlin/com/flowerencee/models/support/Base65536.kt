package com.flowerencee.models.support

/*
class Base65536 private constructor() {
    init {
        throw UnsupportedOperationException()
    }

    companion object {
        fun encodeBase65536(dataBytes: ByteArray): CharArray {
            val byteCount = dataBytes.size
            val charCount = byteCount / 2 + 1
            val dataChars = CharArray(charCount)
            var byteIndex = 0
            while (byteIndex < byteCount) {
                val leftByte = dataBytes[byteIndex].toInt() and 0xFF shl 8
                val rightByte = (if (byteIndex + 1 < byteCount) dataBytes[byteIndex + 1] else 0x01).toInt() and 0xFF
                dataChars[byteIndex / 2] = (leftByte or rightByte).toChar()
                byteIndex += 2
            }
            if (byteCount % 2 == 0) {
                dataChars[charCount - 1] = 0x0100.toChar()
            }
            return dataChars
        }

        fun encodeBase65536String(dataBytes: ByteArray): String {
            return encodeBase65536(dataBytes).toString()
        }

        fun decodeBase65536(dataChars: CharArray): ByteArray {
            val charCount = dataChars.size
            require(!(dataChars[charCount - 1] != 0x0100.toChar() && dataChars[charCount - 1].code and 0xFF != 0x01)) { "Argument 'dataChars' is not a correctly Base65536-encoded bytes." }

            val byteCount = if (dataChars[charCount - 1] == 0x0100.toChar()) (charCount - 1) * 2 else charCount * 2 - 1
            val dataBytes = ByteArray(byteCount)
            var byteIndex = 0
            while (byteIndex < byteCount) {
                val dataChar = dataChars[byteIndex / 2]
                dataBytes[byteIndex] = (dataChar.code ushr 8).toByte()
                if (byteIndex + 1 < byteCount) {
                    dataBytes[byteIndex + 1] = (dataChar.code and 0xFF).toByte()
                }
                byteIndex += 2
            }
            return dataBytes
        }

        fun decodeBase65536(dataString: String): ByteArray {
            return decodeBase65536(dataString.toCharArray())
        }
    }
}*/

class Base65536 private constructor() {
    init {
        throw java.lang.UnsupportedOperationException()
    }

    companion object {
        /**
         * Converts a byte array into a char array using a 65536-based encoding.
         *
         * @param dataBytes array to encode
         * @return encoded char array
         */
        private fun encodeBase65536(dataBytes: ByteArray): CharArray {
            val byteCount = dataBytes.size
            val charCount = byteCount / 2 + 1
            val dataChars = CharArray(charCount)
            var byteIndex = 0
            while (byteIndex < byteCount) {
                val leftByte = dataBytes[byteIndex].toInt() and 0xFF shl 8
                val rightByte = (if (byteIndex + 1 < byteCount) dataBytes[byteIndex + 1] else 0x01).toInt() and 0xFF
                dataChars[byteIndex / 2] = (leftByte or rightByte).toChar()
                byteIndex += 2
            }
            if (byteCount % 2 == 0) {
                dataChars[charCount - 1] = 0x0100.toChar()
            }
            return dataChars
        }

        /**
         * Converts a byte array into a [String] using a 65536-based encoding.
         * Equivalent to `new String(Base65536.encodeBase65536(dataBytes))`.
         *
         * @param dataBytes array to encode
         * @return encoded [String]
         */
        fun encodeBase65536String(dataBytes: ByteArray?): String {
            return encodeBase65536(dataBytes!!).toString()
        }

        /**
         * Restores a byte array from a char array encoded with a 65536-based encoding.
         *
         * @param dataChars array to decode
         * @return restored byte array
         * @throws IllegalArgumentException if char array is not a correctly encoded byte array
         */
        private fun decodeBase65536(dataChars: CharArray): ByteArray {
            val charCount = dataChars.size
            require(!(dataChars[charCount - 1] != 0x0100.toChar() && dataChars[charCount - 1].code and 0xFF != 0x01)) { "Argument 'dataChars' is not a correctly Base65536-encoded bytes." }
            val byteCount = if (dataChars[charCount - 1] == 0x0100.toChar()) (charCount - 1) * 2 else charCount * 2 - 1
            val dataBytes = ByteArray(byteCount)
            var byteIndex = 0
            while (byteIndex < byteCount) {
                val dataChar = dataChars[byteIndex / 2]
                dataBytes[byteIndex] = (dataChar.code ushr 8).toByte()
                if (byteIndex + 1 < byteCount) {
                    dataBytes[byteIndex + 1] = (dataChar.code and 0xFF).toByte()
                }
                byteIndex += 2
            }
            return dataBytes
        }

        /**
         * Restores a byte array from a [String] encoded with a 65536-based encoding.
         * Equivalent to `decodeBase65536(dataString.toCharArray)`.
         *
         * @param dataString [String] to decode
         * @return restored byte array
         * @throws IllegalArgumentException if [String] is not a correctly encoded byte array
         */
        fun decodeBase65536(dataString: String): ByteArray {
            return decodeBase65536(dataString.toCharArray())
        }
    }
}