package org.bouncycastle.its.asn1;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERSequence;

/**
 * <pre>
 *     CertificateBase ::= SEQUENCE {
 *         version Uint8(3),
 *         type CertificateType,
 *         issuer IssuerIdentifier,
 *         toBeSigned ToBeSignedCertificate,
 *         signature Signature OPTIONAL
 *     }
 * </pre>
 */
public class CertificateBase
    extends ASN1Object
{
    private CertificateType type;
    private byte[] version;


    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector v = new ASN1EncodableVector();

        return new DERSequence(v);
    }
}