@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.acmpca

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.acmpca.CfnCertificateAuthority

public
    fun generalNameProperty(initializer: CfnCertificateAuthority.GeneralNameProperty.Builder.() -> Unit):
    CfnCertificateAuthority.GeneralNameProperty =
    CfnCertificateAuthority.GeneralNameProperty.builder().apply(initializer).build()
