@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.waf

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.waf.CfnWebACL
import software.amazon.awscdk.services.waf.CfnWebACLProps
import software.constructs.Construct

public fun Construct.cfnWebACL(
  id: String,
  props: CfnWebACLProps,
  initializer: CfnWebACL.() -> Unit = {},
): CfnWebACL = CfnWebACL(this, id, props).apply(initializer)
