package com.faendir.awscdkkt.generated.services.route53resolver

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroupAssociation
import software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroupAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnFirewallRuleGroupAssociation(id: String,
    props: CfnFirewallRuleGroupAssociationProps): CfnFirewallRuleGroupAssociation =
    CfnFirewallRuleGroupAssociation(this, id, props)

@Generated
public fun Construct.cfnFirewallRuleGroupAssociation(
  id: String,
  props: CfnFirewallRuleGroupAssociationProps,
  initializer: @AwsCdkDsl CfnFirewallRuleGroupAssociation.() -> Unit,
): CfnFirewallRuleGroupAssociation = CfnFirewallRuleGroupAssociation(this, id,
    props).apply(initializer)

@Generated
public fun Construct.buildCfnFirewallRuleGroupAssociation(id: String, initializer: @AwsCdkDsl
    CfnFirewallRuleGroupAssociation.Builder.() -> Unit): CfnFirewallRuleGroupAssociation =
    CfnFirewallRuleGroupAssociation.Builder.create(this, id).apply(initializer).build()
