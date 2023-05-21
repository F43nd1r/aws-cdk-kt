package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPool

@Generated
public
    fun accountRecoverySettingProperty(initializer: CfnUserPool.AccountRecoverySettingProperty.Builder.() -> Unit
    = {}): CfnUserPool.AccountRecoverySettingProperty =
    CfnUserPool.AccountRecoverySettingProperty.builder().apply(initializer).build()
