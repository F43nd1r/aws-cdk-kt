@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy

public
    fun xSSProtectionProperty(initializer: CfnResponseHeadersPolicy.XSSProtectionProperty.Builder.() -> Unit):
    CfnResponseHeadersPolicy.XSSProtectionProperty =
    CfnResponseHeadersPolicy.XSSProtectionProperty.builder().apply(initializer).build()
