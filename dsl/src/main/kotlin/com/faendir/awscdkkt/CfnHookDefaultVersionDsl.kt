@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.CfnHookDefaultVersion
import software.amazon.awscdk.CfnHookDefaultVersionProps
import software.constructs.Construct

public fun Construct.cfnHookDefaultVersion(id: String, initializer: CfnHookDefaultVersion.() -> Unit
    = {}): CfnHookDefaultVersion = CfnHookDefaultVersion(this, id).apply(initializer)

public fun Construct.cfnHookDefaultVersion(
  id: String,
  props: CfnHookDefaultVersionProps,
  initializer: CfnHookDefaultVersion.() -> Unit = {},
): CfnHookDefaultVersion = CfnHookDefaultVersion(this, id, props).apply(initializer)
