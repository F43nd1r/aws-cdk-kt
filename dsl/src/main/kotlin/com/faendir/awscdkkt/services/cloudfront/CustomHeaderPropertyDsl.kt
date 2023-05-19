@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy

public
    fun customHeaderProperty(initializer: CfnResponseHeadersPolicy.CustomHeaderProperty.Builder.() -> Unit):
    CfnResponseHeadersPolicy.CustomHeaderProperty =
    CfnResponseHeadersPolicy.CustomHeaderProperty.builder().apply(initializer).build()
