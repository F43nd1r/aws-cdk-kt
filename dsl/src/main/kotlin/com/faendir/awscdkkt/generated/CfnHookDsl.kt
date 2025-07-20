package com.faendir.awscdkkt.generated

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.CfnHook
import software.amazon.awscdk.CfnHookProps
import software.constructs.Construct

@Generated
public fun Construct.cfnHook(
  id: String,
  props: CfnHookProps,
  initializer: @AwsCdkDsl CfnHook.() -> Unit = {},
): CfnHook = CfnHook(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnHook(id: String, initializer: @AwsCdkDsl CfnHook.Builder.() -> Unit = {}): CfnHook = CfnHook.Builder.create(this, id).apply(initializer).build()
