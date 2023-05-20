@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.CfnHookTypeConfig
import software.amazon.awscdk.CfnHookTypeConfigProps
import software.constructs.Construct

public fun Construct.cfnHookTypeConfig(
  id: String,
  props: CfnHookTypeConfigProps,
  initializer: CfnHookTypeConfig.() -> Unit = {},
): CfnHookTypeConfig = CfnHookTypeConfig(this, id, props).apply(initializer)
