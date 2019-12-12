package af.asr.qrcodegenerator.exception.qrcodegenerator.spi;


import af.asr.qrcodegenerator.exception.qrcodegenerator.exception.QrcodeGenerationException;

import java.io.IOException;

/**
 * Interface for QR-Code-Generation
 */
public interface QrCodeGenerator<T> {

	/**
	 * Method to generate QR Code
	 * 
	 * @param data    data to encode in the QR code
	 * @param version QR Code version
	 * @return array of byte containing QR Code in PNG format
	 * @throws QrcodeGenerationException exceptions which may occur when encoding a
	 *                                   QRcode using the Writer framework.
	 * @throws IOException               exceptions which may occur when write to
	 *                                   the byte stream fail
	 */
	byte[] generateQrCode(String data, T version) throws QrcodeGenerationException, IOException;

}