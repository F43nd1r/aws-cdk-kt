@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.guardduty

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.guardduty.CfnIPSet
import software.amazon.awscdk.services.guardduty.CfnIPSetProps
import software.constructs.Construct

public fun Construct.cfnIPSet(
  id: String,
  props: CfnIPSetProps,
  initializer: CfnIPSet.() -> Unit = {},
): CfnIPSet = CfnIPSet(this, id, props).apply(initializer)
