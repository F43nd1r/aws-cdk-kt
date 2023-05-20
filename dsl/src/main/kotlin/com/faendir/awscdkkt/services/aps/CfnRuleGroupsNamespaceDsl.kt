@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.aps

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.aps.CfnRuleGroupsNamespace
import software.amazon.awscdk.services.aps.CfnRuleGroupsNamespaceProps
import software.constructs.Construct

public fun Construct.cfnRuleGroupsNamespace(
  id: String,
  props: CfnRuleGroupsNamespaceProps,
  initializer: CfnRuleGroupsNamespace.() -> Unit = {},
): CfnRuleGroupsNamespace = CfnRuleGroupsNamespace(this, id, props).apply(initializer)
