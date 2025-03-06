package com.faendir.awscdkkt.generated.services.cloudformation

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudformation.CfnLambdaHook

@Generated
public fun buildHookTargetProperty(initializer: @AwsCdkDsl
    CfnLambdaHook.HookTargetProperty.Builder.() -> Unit = {}): CfnLambdaHook.HookTargetProperty =
    CfnLambdaHook.HookTargetProperty.Builder().apply(initializer).build()
