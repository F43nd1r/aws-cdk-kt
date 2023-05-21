package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rds.OptionGroup
import software.amazon.awscdk.services.rds.OptionGroupProps
import software.constructs.Construct

@Generated
public fun Construct.optionGroup(
  id: String,
  props: OptionGroupProps,
  initializer: OptionGroup.() -> Unit = {},
): OptionGroup = OptionGroup(this, id, props).apply(initializer)
