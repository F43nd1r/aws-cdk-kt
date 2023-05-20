@file:Generated(value = ["Generated based on CDK v2.79.1"])

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
