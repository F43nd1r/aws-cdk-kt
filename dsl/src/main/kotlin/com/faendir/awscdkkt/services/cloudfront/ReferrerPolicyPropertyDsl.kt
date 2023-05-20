@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy

public
    fun referrerPolicyProperty(initializer: CfnResponseHeadersPolicy.ReferrerPolicyProperty.Builder.() -> Unit):
    CfnResponseHeadersPolicy.ReferrerPolicyProperty =
    CfnResponseHeadersPolicy.ReferrerPolicyProperty.builder().apply(initializer).build()
