@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.wafv2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.wafv2.CfnWebACL
import software.amazon.awscdk.services.wafv2.CfnWebACLProps
import software.constructs.Construct

public fun Construct.cfnWebACL(
  id: String,
  props: CfnWebACLProps,
  initializer: CfnWebACL.() -> Unit = {},
): CfnWebACL = CfnWebACL(this, id, props).apply(initializer)
