@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPool

public
    fun accountRecoverySettingProperty(initializer: CfnUserPool.AccountRecoverySettingProperty.Builder.() -> Unit):
    CfnUserPool.AccountRecoverySettingProperty =
    CfnUserPool.AccountRecoverySettingProperty.builder().apply(initializer).build()
