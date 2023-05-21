package com.faendir.awscdkkt.services.acmpca

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.acmpca.CfnCertificateAuthority

@Generated
public
    fun csrExtensionsProperty(initializer: CfnCertificateAuthority.CsrExtensionsProperty.Builder.() -> Unit
    = {}): CfnCertificateAuthority.CsrExtensionsProperty =
    CfnCertificateAuthority.CsrExtensionsProperty.builder().apply(initializer).build()
