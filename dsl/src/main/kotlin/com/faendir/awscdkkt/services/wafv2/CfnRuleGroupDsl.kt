@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.wafv2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.wafv2.CfnRuleGroup
import software.amazon.awscdk.services.wafv2.CfnRuleGroupProps
import software.constructs.Construct

public fun Construct.cfnRuleGroup(
  id: String,
  props: CfnRuleGroupProps,
  initializer: CfnRuleGroup.() -> Unit = {},
): CfnRuleGroup = CfnRuleGroup(this, id, props).apply(initializer)
