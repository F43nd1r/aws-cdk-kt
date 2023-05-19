@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy

public
    fun securityHeadersConfigProperty(initializer: CfnResponseHeadersPolicy.SecurityHeadersConfigProperty.Builder.() -> Unit):
    CfnResponseHeadersPolicy.SecurityHeadersConfigProperty =
    CfnResponseHeadersPolicy.SecurityHeadersConfigProperty.builder().apply(initializer).build()
