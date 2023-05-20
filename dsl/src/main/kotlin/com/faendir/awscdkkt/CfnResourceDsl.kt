@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
