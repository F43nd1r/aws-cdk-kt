package com.faendir.awscdkkt

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.CfnHookVersion
import software.amazon.awscdk.CfnHookVersionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnHookVersion(
  id: String,
  props: CfnHookVersionProps,
  initializer: CfnHookVersion.() -> Unit = {},
): CfnHookVersion = CfnHookVersion(this, id, props).apply(initializer)
