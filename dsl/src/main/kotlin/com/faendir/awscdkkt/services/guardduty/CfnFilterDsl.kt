@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.guardduty

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.guardduty.CfnFilter
import software.amazon.awscdk.services.guardduty.CfnFilterProps
import software.constructs.Construct

public fun Construct.cfnFilter(
  id: String,
  props: CfnFilterProps,
  initializer: CfnFilter.() -> Unit = {},
): CfnFilter = CfnFilter(this, id, props).apply(initializer)
