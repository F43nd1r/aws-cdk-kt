package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy

@Generated
public
    fun frameOptionsProperty(initializer: CfnResponseHeadersPolicy.FrameOptionsProperty.Builder.() -> Unit
    = {}): CfnResponseHeadersPolicy.FrameOptionsProperty =
    CfnResponseHeadersPolicy.FrameOptionsProperty.builder().apply(initializer).build()
