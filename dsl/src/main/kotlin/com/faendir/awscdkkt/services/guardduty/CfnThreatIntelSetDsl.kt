@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.guardduty

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.guardduty.CfnThreatIntelSet
import software.amazon.awscdk.services.guardduty.CfnThreatIntelSetProps
import software.constructs.Construct

public fun Construct.cfnThreatIntelSet(
  id: String,
  props: CfnThreatIntelSetProps,
  initializer: CfnThreatIntelSet.() -> Unit = {},
): CfnThreatIntelSet = CfnThreatIntelSet(this, id, props).apply(initializer)
