@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.lakeformation

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lakeformation.CfnResource
import software.amazon.awscdk.services.lakeformation.CfnResourceProps
import software.constructs.Construct

public fun Construct.cfnResource(
  id: String,
  props: CfnResourceProps,
  initializer: CfnResource.() -> Unit = {},
): CfnResource = CfnResource(this, id, props).apply(initializer)
