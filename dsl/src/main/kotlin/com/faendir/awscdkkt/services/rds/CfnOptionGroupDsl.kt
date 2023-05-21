package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rds.CfnOptionGroup
import software.amazon.awscdk.services.rds.CfnOptionGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnOptionGroup(
  id: String,
  props: CfnOptionGroupProps,
  initializer: CfnOptionGroup.() -> Unit = {},
): CfnOptionGroup = CfnOptionGroup(this, id, props).apply(initializer)
