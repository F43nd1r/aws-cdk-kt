package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPool

@Generated
public fun passwordPolicyProperty(initializer: CfnUserPool.PasswordPolicyProperty.Builder.() -> Unit
    = {}): CfnUserPool.PasswordPolicyProperty =
    CfnUserPool.PasswordPolicyProperty.builder().apply(initializer).build()
