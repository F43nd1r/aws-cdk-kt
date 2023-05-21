package com.faendir.awscdkkt.services.cloudformation

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudformation.CfnHookTypeConfig
import software.amazon.awscdk.services.cloudformation.CfnHookTypeConfigProps
import software.constructs.Construct

@Generated
public fun Construct.cfnHookTypeConfig(
  id: String,
  props: CfnHookTypeConfigProps,
  initializer: CfnHookTypeConfig.() -> Unit = {},
): CfnHookTypeConfig = CfnHookTypeConfig(this, id, props).apply(initializer)
