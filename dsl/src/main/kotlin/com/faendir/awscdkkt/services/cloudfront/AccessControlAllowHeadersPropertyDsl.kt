package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy

@Generated
public
    fun accessControlAllowHeadersProperty(initializer: CfnResponseHeadersPolicy.AccessControlAllowHeadersProperty.Builder.() -> Unit
    = {}): CfnResponseHeadersPolicy.AccessControlAllowHeadersProperty =
    CfnResponseHeadersPolicy.AccessControlAllowHeadersProperty.builder().apply(initializer).build()
