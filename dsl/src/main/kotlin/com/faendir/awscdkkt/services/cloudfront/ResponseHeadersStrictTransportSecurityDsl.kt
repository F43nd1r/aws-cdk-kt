package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.ResponseHeadersStrictTransportSecurity

@Generated
public
    fun responseHeadersStrictTransportSecurity(initializer: ResponseHeadersStrictTransportSecurity.Builder.() -> Unit
    = {}): ResponseHeadersStrictTransportSecurity =
    ResponseHeadersStrictTransportSecurity.builder().apply(initializer).build()
