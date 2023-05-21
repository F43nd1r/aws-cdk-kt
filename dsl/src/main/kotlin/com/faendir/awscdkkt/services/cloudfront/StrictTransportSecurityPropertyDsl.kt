package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy

@Generated
public
    fun strictTransportSecurityProperty(initializer: CfnResponseHeadersPolicy.StrictTransportSecurityProperty.Builder.() -> Unit
    = {}): CfnResponseHeadersPolicy.StrictTransportSecurityProperty =
    CfnResponseHeadersPolicy.StrictTransportSecurityProperty.builder().apply(initializer).build()
