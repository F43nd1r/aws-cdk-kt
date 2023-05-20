@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.CfnHook
import software.amazon.awscdk.CfnHookProps
import software.constructs.Construct

public fun Construct.cfnHook(
  id: String,
  props: CfnHookProps,
  initializer: CfnHook.() -> Unit = {},
): CfnHook = CfnHook(this, id, props).apply(initializer)
