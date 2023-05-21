package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy

@Generated
public
    fun originRequestPolicyConfigProperty(initializer: CfnOriginRequestPolicy.OriginRequestPolicyConfigProperty.Builder.() -> Unit
    = {}): CfnOriginRequestPolicy.OriginRequestPolicyConfigProperty =
    CfnOriginRequestPolicy.OriginRequestPolicyConfigProperty.builder().apply(initializer).build()
