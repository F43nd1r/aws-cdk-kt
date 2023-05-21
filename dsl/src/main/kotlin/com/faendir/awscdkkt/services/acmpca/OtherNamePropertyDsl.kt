package com.faendir.awscdkkt.services.acmpca

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.acmpca.CfnCertificateAuthority

@Generated
public
    fun otherNameProperty(initializer: CfnCertificateAuthority.OtherNameProperty.Builder.() -> Unit
    = {}): CfnCertificateAuthority.OtherNameProperty =
    CfnCertificateAuthority.OtherNameProperty.builder().apply(initializer).build()
