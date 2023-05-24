package com.faendir.awscdkkt.generated.services.cloudformation

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudformation.CfnHookTypeConfig
import software.amazon.awscdk.services.cloudformation.CfnHookTypeConfigProps
import software.constructs.Construct

@Generated
public fun Construct.cfnHookTypeConfig(id: String, props: CfnHookTypeConfigProps): CfnHookTypeConfig
    = CfnHookTypeConfig(this, id, props)

@Generated
public fun Construct.cfnHookTypeConfig(
  id: String,
  props: CfnHookTypeConfigProps,
  initializer: @AwsCdkDsl CfnHookTypeConfig.() -> Unit,
): CfnHookTypeConfig = CfnHookTypeConfig(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnHookTypeConfig(id: String, initializer: @AwsCdkDsl
    CfnHookTypeConfig.Builder.() -> Unit): CfnHookTypeConfig =
    CfnHookTypeConfig.Builder.create(this, id).apply(initializer).build()
