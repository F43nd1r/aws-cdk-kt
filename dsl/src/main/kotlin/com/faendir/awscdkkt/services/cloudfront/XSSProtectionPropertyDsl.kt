@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy

public
    fun xSSProtectionProperty(initializer: CfnResponseHeadersPolicy.XSSProtectionProperty.Builder.() -> Unit):
    CfnResponseHeadersPolicy.XSSProtectionProperty =
    CfnResponseHeadersPolicy.XSSProtectionProperty.builder().apply(initializer).build()
