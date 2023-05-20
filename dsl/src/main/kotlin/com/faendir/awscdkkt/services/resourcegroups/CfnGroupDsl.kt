@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.resourcegroups

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.resourcegroups.CfnGroup
import software.amazon.awscdk.services.resourcegroups.CfnGroupProps
import software.constructs.Construct

public fun Construct.cfnGroup(
  id: String,
  props: CfnGroupProps,
  initializer: CfnGroup.() -> Unit = {},
): CfnGroup = CfnGroup(this, id, props).apply(initializer)
