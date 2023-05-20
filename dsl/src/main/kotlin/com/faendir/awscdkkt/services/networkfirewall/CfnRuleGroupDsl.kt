@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.networkfirewall

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroup
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroupProps
import software.constructs.Construct

public fun Construct.cfnRuleGroup(
  id: String,
  props: CfnRuleGroupProps,
  initializer: CfnRuleGroup.() -> Unit = {},
): CfnRuleGroup = CfnRuleGroup(this, id, props).apply(initializer)
