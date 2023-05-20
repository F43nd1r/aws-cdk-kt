@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy

public
    fun customHeaderProperty(initializer: CfnResponseHeadersPolicy.CustomHeaderProperty.Builder.() -> Unit):
    CfnResponseHeadersPolicy.CustomHeaderProperty =
    CfnResponseHeadersPolicy.CustomHeaderProperty.builder().apply(initializer).build()
