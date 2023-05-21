package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.ResponseHeadersContentSecurityPolicy

@Generated
public
    fun responseHeadersContentSecurityPolicy(initializer: ResponseHeadersContentSecurityPolicy.Builder.() -> Unit
    = {}): ResponseHeadersContentSecurityPolicy =
    ResponseHeadersContentSecurityPolicy.builder().apply(initializer).build()
