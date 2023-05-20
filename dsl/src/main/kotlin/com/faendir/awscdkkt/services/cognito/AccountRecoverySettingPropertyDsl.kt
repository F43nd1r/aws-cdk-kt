@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPool

public
    fun accountRecoverySettingProperty(initializer: CfnUserPool.AccountRecoverySettingProperty.Builder.() -> Unit):
    CfnUserPool.AccountRecoverySettingProperty =
    CfnUserPool.AccountRecoverySettingProperty.builder().apply(initializer).build()
