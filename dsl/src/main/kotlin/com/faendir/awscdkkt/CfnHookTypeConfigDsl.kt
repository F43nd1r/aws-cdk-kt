@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
