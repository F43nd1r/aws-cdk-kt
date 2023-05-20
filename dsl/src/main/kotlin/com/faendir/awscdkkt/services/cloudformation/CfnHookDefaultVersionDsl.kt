@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.cloudformation

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudformation.CfnHookDefaultVersion
import software.amazon.awscdk.services.cloudformation.CfnHookDefaultVersionProps
import software.constructs.Construct

public fun Construct.cfnHookDefaultVersion(id: String, initializer: CfnHookDefaultVersion.() -> Unit
    = {}): CfnHookDefaultVersion = CfnHookDefaultVersion(this, id).apply(initializer)

public fun Construct.cfnHookDefaultVersion(
  id: String,
  props: CfnHookDefaultVersionProps,
  initializer: CfnHookDefaultVersion.() -> Unit = {},
): CfnHookDefaultVersion = CfnHookDefaultVersion(this, id, props).apply(initializer)
