@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy

public
    fun headersConfigProperty(initializer: CfnOriginRequestPolicy.HeadersConfigProperty.Builder.() -> Unit):
    CfnOriginRequestPolicy.HeadersConfigProperty =
    CfnOriginRequestPolicy.HeadersConfigProperty.builder().apply(initializer).build()
