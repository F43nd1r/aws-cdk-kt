package com.faendir.awscdkkt.services.acmpca

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.acmpca.CfnCertificateAuthority

@Generated
public
    fun revocationConfigurationProperty(initializer: CfnCertificateAuthority.RevocationConfigurationProperty.Builder.() -> Unit
    = {}): CfnCertificateAuthority.RevocationConfigurationProperty =
    CfnCertificateAuthority.RevocationConfigurationProperty.builder().apply(initializer).build()
