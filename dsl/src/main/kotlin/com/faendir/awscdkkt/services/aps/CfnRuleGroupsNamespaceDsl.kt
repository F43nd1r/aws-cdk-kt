@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
