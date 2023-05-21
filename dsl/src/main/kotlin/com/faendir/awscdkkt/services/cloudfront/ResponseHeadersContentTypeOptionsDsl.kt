package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.ResponseHeadersContentTypeOptions

@Generated
public
    fun responseHeadersContentTypeOptions(initializer: ResponseHeadersContentTypeOptions.Builder.() -> Unit
    = {}): ResponseHeadersContentTypeOptions =
    ResponseHeadersContentTypeOptions.builder().apply(initializer).build()
