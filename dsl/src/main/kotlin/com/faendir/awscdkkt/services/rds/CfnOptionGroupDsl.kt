@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rds.CfnOptionGroup
import software.amazon.awscdk.services.rds.CfnOptionGroupProps
import software.constructs.Construct

public fun Construct.cfnOptionGroup(
  id: String,
  props: CfnOptionGroupProps,
  initializer: CfnOptionGroup.() -> Unit = {},
): CfnOptionGroup = CfnOptionGroup(this, id, props).apply(initializer)
