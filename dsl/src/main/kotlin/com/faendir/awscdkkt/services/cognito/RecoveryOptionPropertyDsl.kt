package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPool

@Generated
public fun recoveryOptionProperty(initializer: CfnUserPool.RecoveryOptionProperty.Builder.() -> Unit
    = {}): CfnUserPool.RecoveryOptionProperty =
    CfnUserPool.RecoveryOptionProperty.builder().apply(initializer).build()
