package com.faendir.awscdkkt.generated.services.cognito

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPool

@Generated
public fun buildRecoveryOptionProperty(initializer: @AwsCdkDsl
    CfnUserPool.RecoveryOptionProperty.Builder.() -> Unit = {}): CfnUserPool.RecoveryOptionProperty
    = CfnUserPool.RecoveryOptionProperty.Builder().apply(initializer).build()
