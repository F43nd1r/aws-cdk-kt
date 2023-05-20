@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.cloudformation

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudformation.CfnResourceVersion
import software.amazon.awscdk.services.cloudformation.CfnResourceVersionProps
import software.constructs.Construct

public fun Construct.cfnResourceVersion(
  id: String,
  props: CfnResourceVersionProps,
  initializer: CfnResourceVersion.() -> Unit = {},
): CfnResourceVersion = CfnResourceVersion(this, id, props).apply(initializer)
