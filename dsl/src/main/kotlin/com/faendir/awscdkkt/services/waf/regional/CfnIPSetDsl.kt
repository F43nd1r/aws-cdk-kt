@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.waf.regional

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.waf.regional.CfnIPSet
import software.amazon.awscdk.services.waf.regional.CfnIPSetProps
import software.constructs.Construct

public fun Construct.cfnIPSet(
  id: String,
  props: CfnIPSetProps,
  initializer: CfnIPSet.() -> Unit = {},
): CfnIPSet = CfnIPSet(this, id, props).apply(initializer)
