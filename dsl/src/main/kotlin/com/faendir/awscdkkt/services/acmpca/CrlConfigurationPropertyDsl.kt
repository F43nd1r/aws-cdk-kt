package com.faendir.awscdkkt.services.acmpca

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.acmpca.CfnCertificateAuthority

@Generated
public
    fun crlConfigurationProperty(initializer: CfnCertificateAuthority.CrlConfigurationProperty.Builder.() -> Unit
    = {}): CfnCertificateAuthority.CrlConfigurationProperty =
    CfnCertificateAuthority.CrlConfigurationProperty.builder().apply(initializer).build()
