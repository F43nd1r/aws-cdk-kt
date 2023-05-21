package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CfnCodeSigningConfig

@Generated
public
    fun codeSigningPoliciesProperty(initializer: CfnCodeSigningConfig.CodeSigningPoliciesProperty.Builder.() -> Unit
    = {}): CfnCodeSigningConfig.CodeSigningPoliciesProperty =
    CfnCodeSigningConfig.CodeSigningPoliciesProperty.builder().apply(initializer).build()
