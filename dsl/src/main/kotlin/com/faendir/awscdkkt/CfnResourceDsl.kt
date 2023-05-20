@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.CfnResource
import software.amazon.awscdk.CfnResourceProps
import software.constructs.Construct

public fun Construct.cfnResource(
  id: String,
  props: CfnResourceProps,
  initializer: CfnResource.() -> Unit = {},
): CfnResource = CfnResource(this, id, props).apply(initializer)
