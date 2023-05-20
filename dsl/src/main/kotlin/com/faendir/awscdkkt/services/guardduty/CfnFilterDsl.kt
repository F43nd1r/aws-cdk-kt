@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
