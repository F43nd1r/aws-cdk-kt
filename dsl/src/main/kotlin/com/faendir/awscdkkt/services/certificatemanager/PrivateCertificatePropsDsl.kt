package com.faendir.awscdkkt.services.certificatemanager

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.certificatemanager.PrivateCertificateProps

@Generated
public fun privateCertificateProps(initializer: PrivateCertificateProps.Builder.() -> Unit = {}):
    PrivateCertificateProps = PrivateCertificateProps.builder().apply(initializer).build()
