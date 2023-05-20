@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy

public
    fun customHeadersConfigProperty(initializer: CfnResponseHeadersPolicy.CustomHeadersConfigProperty.Builder.() -> Unit):
    CfnResponseHeadersPolicy.CustomHeadersConfigProperty =
    CfnResponseHeadersPolicy.CustomHeadersConfigProperty.builder().apply(initializer).build()
