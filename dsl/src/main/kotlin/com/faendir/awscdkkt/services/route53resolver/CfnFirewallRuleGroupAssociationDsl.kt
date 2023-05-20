@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.route53resolver

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroupAssociation
import software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroupAssociationProps
import software.constructs.Construct

public fun Construct.cfnFirewallRuleGroupAssociation(
  id: String,
  props: CfnFirewallRuleGroupAssociationProps,
  initializer: CfnFirewallRuleGroupAssociation.() -> Unit = {},
): CfnFirewallRuleGroupAssociation = CfnFirewallRuleGroupAssociation(this, id,
    props).apply(initializer)
