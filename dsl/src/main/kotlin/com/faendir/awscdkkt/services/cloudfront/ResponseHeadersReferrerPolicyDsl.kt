package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.ResponseHeadersReferrerPolicy

@Generated
public
    fun responseHeadersReferrerPolicy(initializer: ResponseHeadersReferrerPolicy.Builder.() -> Unit
    = {}): ResponseHeadersReferrerPolicy =
    ResponseHeadersReferrerPolicy.builder().apply(initializer).build()
