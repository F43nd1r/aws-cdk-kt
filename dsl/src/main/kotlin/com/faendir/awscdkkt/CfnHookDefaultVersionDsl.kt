package com.faendir.awscdkkt

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.CfnHookDefaultVersion
import software.amazon.awscdk.CfnHookDefaultVersionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnHookDefaultVersion(id: String, initializer: CfnHookDefaultVersion.() -> Unit
    = {}): CfnHookDefaultVersion = CfnHookDefaultVersion(this, id).apply(initializer)

@Generated
public fun Construct.cfnHookDefaultVersion(
  id: String,
  props: CfnHookDefaultVersionProps,
  initializer: CfnHookDefaultVersion.() -> Unit = {},
): CfnHookDefaultVersion = CfnHookDefaultVersion(this, id, props).apply(initializer)
