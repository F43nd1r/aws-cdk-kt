@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPool

public
    fun passwordPolicyProperty(initializer: CfnUserPool.PasswordPolicyProperty.Builder.() -> Unit):
    CfnUserPool.PasswordPolicyProperty =
    CfnUserPool.PasswordPolicyProperty.builder().apply(initializer).build()
