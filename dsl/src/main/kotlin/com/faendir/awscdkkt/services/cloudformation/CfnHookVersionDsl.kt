@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.cloudformation

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudformation.CfnHookVersion
import software.amazon.awscdk.services.cloudformation.CfnHookVersionProps
import software.constructs.Construct

public fun Construct.cfnHookVersion(
  id: String,
  props: CfnHookVersionProps,
  initializer: CfnHookVersion.() -> Unit = {},
): CfnHookVersion = CfnHookVersion(this, id, props).apply(initializer)
