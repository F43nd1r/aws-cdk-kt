package com.faendir.awscdkkt.services.certificatemanager

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.certificatemanager.CertificateProps

@Generated
public fun certificateProps(initializer: CertificateProps.Builder.() -> Unit = {}): CertificateProps
    = CertificateProps.builder().apply(initializer).build()
