package com.faendir.awscdkkt.generated

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.CfnLambdaHook
import software.amazon.awscdk.CfnLambdaHookProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLambdaHook(
  id: String,
  props: CfnLambdaHookProps,
  initializer: @AwsCdkDsl CfnLambdaHook.() -> Unit = {},
): CfnLambdaHook = CfnLambdaHook(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnLambdaHook(id: String, initializer: @AwsCdkDsl
    CfnLambdaHook.Builder.() -> Unit = {}): CfnLambdaHook = CfnLambdaHook.Builder.create(this,
    id).apply(initializer).build()
