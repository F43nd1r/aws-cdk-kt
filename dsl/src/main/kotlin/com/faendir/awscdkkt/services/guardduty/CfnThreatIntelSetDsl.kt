@file:Generated(value = ["Generated based on CDK v2.80.0"])

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
