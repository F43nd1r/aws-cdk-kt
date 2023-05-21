package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.ResponseHeadersXSSProtection

@Generated
public fun responseHeadersXSSProtection(initializer: ResponseHeadersXSSProtection.Builder.() -> Unit
    = {}): ResponseHeadersXSSProtection =
    ResponseHeadersXSSProtection.builder().apply(initializer).build()
