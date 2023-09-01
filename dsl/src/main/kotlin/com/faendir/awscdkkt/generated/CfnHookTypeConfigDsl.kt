package com.faendir.awscdkkt.generated

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.CfnHookTypeConfig
import software.amazon.awscdk.CfnHookTypeConfigProps
import software.constructs.Construct

@Generated
public fun Construct.cfnHookTypeConfig(
  id: String,
  props: CfnHookTypeConfigProps,
  initializer: @AwsCdkDsl CfnHookTypeConfig.() -> Unit = {},
): CfnHookTypeConfig = CfnHookTypeConfig(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnHookTypeConfig(id: String, initializer: @AwsCdkDsl
    CfnHookTypeConfig.Builder.() -> Unit = {}): CfnHookTypeConfig =
    CfnHookTypeConfig.Builder.create(this, id).apply(initializer).build()
