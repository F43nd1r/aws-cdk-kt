package com.faendir.awscdkkt.services.inspectorv2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.inspectorv2.CfnFilter
import software.amazon.awscdk.services.inspectorv2.CfnFilterProps
import software.constructs.Construct

@Generated
public fun Construct.cfnFilter(
  id: String,
  props: CfnFilterProps,
  initializer: CfnFilter.() -> Unit = {},
): CfnFilter = CfnFilter(this, id, props).apply(initializer)
