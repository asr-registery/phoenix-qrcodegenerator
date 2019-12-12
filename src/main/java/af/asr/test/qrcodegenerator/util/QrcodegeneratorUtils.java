package af.asr.test.qrcodegenerator.util;


import af.asr.test.qrcodegenerator.exception.common.NullPointerException;
import af.asr.test.qrcodegenerator.exception.qrcodegenerator.exception.InvalidInputException;

/**
 * Utils class for QR code generator
 */
public class QrcodegeneratorUtils {
    /**
     * Constructor for this class
     */
    private QrcodegeneratorUtils() {

    }

    /**
     * Verify the input send by user
     *
     * @param data    data send by user
     * @param version {@link QrVersion} send by user
     */
    public static void verifyInput(String data, QrVersion version) {
        if (data == null) {
            throw new NullPointerException(QrcodeExceptionConstants.INVALID_INPUT_DATA_NULL.getErrorCode(),
                    QrcodeExceptionConstants.INVALID_INPUT_DATA_NULL.getErrorMessage());
        } else if (data.trim().isEmpty()) {
            throw new InvalidInputException(QrcodeExceptionConstants.INVALID_INPUT_DATA_EMPTY.getErrorCode(),
                    QrcodeExceptionConstants.INVALID_INPUT_DATA_EMPTY.getErrorMessage());
        } else if (version == null) {
            throw new NullPointerException(QrcodeExceptionConstants.INVALID_INPUT_VERSION.getErrorCode(),
                    QrcodeExceptionConstants.INVALID_INPUT_VERSION.getErrorMessage());
        }
    }
}