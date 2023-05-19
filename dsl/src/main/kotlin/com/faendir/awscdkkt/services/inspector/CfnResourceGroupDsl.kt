@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.inspector

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.inspector.CfnResourceGroup
import software.amazon.awscdk.services.inspector.CfnResourceGroupProps
import software.constructs.Construct

public fun Construct.cfnResourceGroup(
  id: String,
  props: CfnResourceGroupProps,
  initializer: CfnResourceGroup.() -> Unit = {},
): CfnResourceGroup = CfnResourceGroup(this, id, props).apply(initializer)
