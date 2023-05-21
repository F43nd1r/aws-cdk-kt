package com.faendir.awscdkkt.services.route53resolver

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53resolver.CfnFirewallDomainList
import software.amazon.awscdk.services.route53resolver.CfnFirewallDomainListProps
import software.constructs.Construct

@Generated
public fun Construct.cfnFirewallDomainList(id: String, initializer: CfnFirewallDomainList.() -> Unit
    = {}): CfnFirewallDomainList = CfnFirewallDomainList(this, id).apply(initializer)

@Generated
public fun Construct.cfnFirewallDomainList(
  id: String,
  props: CfnFirewallDomainListProps,
  initializer: CfnFirewallDomainList.() -> Unit = {},
): CfnFirewallDomainList = CfnFirewallDomainList(this, id, props).apply(initializer)
