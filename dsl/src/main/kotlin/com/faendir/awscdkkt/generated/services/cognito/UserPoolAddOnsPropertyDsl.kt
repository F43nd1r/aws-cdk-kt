package com.faendir.awscdkkt.generated.services.cognito

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPool

@Generated
public fun buildUserPoolAddOnsProperty(initializer: @AwsCdkDsl
    CfnUserPool.UserPoolAddOnsProperty.Builder.() -> Unit = {}): CfnUserPool.UserPoolAddOnsProperty
    = CfnUserPool.UserPoolAddOnsProperty.Builder().apply(initializer).build()
