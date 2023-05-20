@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.waf

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.waf.CfnIPSet
import software.amazon.awscdk.services.waf.CfnIPSetProps
import software.constructs.Construct

public fun Construct.cfnIPSet(
  id: String,
  props: CfnIPSetProps,
  initializer: CfnIPSet.() -> Unit = {},
): CfnIPSet = CfnIPSet(this, id, props).apply(initializer)
