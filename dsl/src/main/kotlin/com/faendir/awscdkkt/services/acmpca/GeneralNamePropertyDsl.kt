package com.faendir.awscdkkt.services.acmpca

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.acmpca.CfnCertificateAuthority

@Generated
public
    fun generalNameProperty(initializer: CfnCertificateAuthority.GeneralNameProperty.Builder.() -> Unit
    = {}): CfnCertificateAuthority.GeneralNameProperty =
    CfnCertificateAuthority.GeneralNameProperty.builder().apply(initializer).build()
