package com.faendir.awscdkkt.services.config

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.config.CfnConfigRule

@Generated
public
    fun customPolicyDetailsProperty(initializer: CfnConfigRule.CustomPolicyDetailsProperty.Builder.() -> Unit
    = {}): CfnConfigRule.CustomPolicyDetailsProperty =
    CfnConfigRule.CustomPolicyDetailsProperty.builder().apply(initializer).build()
