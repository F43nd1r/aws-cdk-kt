package com.faendir.awscdkkt.services.acmpca

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.acmpca.CfnCertificateAuthority

@Generated
public fun keyUsageProperty(initializer: CfnCertificateAuthority.KeyUsageProperty.Builder.() -> Unit
    = {}): CfnCertificateAuthority.KeyUsageProperty =
    CfnCertificateAuthority.KeyUsageProperty.builder().apply(initializer).build()
