@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
