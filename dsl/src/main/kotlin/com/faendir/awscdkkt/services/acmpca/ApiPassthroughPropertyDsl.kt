package com.faendir.awscdkkt.services.acmpca

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.acmpca.CfnCertificate

@Generated
public
    fun apiPassthroughProperty(initializer: CfnCertificate.ApiPassthroughProperty.Builder.() -> Unit
    = {}): CfnCertificate.ApiPassthroughProperty =
    CfnCertificate.ApiPassthroughProperty.builder().apply(initializer).build()
