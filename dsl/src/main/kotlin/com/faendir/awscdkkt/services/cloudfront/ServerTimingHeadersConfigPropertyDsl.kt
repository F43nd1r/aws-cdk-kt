@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy

public
    fun serverTimingHeadersConfigProperty(initializer: CfnResponseHeadersPolicy.ServerTimingHeadersConfigProperty.Builder.() -> Unit):
    CfnResponseHeadersPolicy.ServerTimingHeadersConfigProperty =
    CfnResponseHeadersPolicy.ServerTimingHeadersConfigProperty.builder().apply(initializer).build()
