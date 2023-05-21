package com.faendir.awscdkkt.services.acmpca

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.acmpca.CfnCertificateAuthority

@Generated
public
    fun customAttributeProperty(initializer: CfnCertificateAuthority.CustomAttributeProperty.Builder.() -> Unit
    = {}): CfnCertificateAuthority.CustomAttributeProperty =
    CfnCertificateAuthority.CustomAttributeProperty.builder().apply(initializer).build()
