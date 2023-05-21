package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.ResponseHeadersFrameOptions

@Generated
public fun responseHeadersFrameOptions(initializer: ResponseHeadersFrameOptions.Builder.() -> Unit =
    {}): ResponseHeadersFrameOptions =
    ResponseHeadersFrameOptions.builder().apply(initializer).build()
