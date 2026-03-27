package com.faendir.awscdkkt.generated.services.route53globalresolver

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53globalresolver.CfnFirewallDomainList
import software.amazon.awscdk.services.route53globalresolver.CfnFirewallDomainListProps
import software.constructs.Construct

@Generated
public fun Construct.cfnFirewallDomainList(
  id: String,
  props: CfnFirewallDomainListProps,
  initializer: @AwsCdkDsl CfnFirewallDomainList.() -> Unit = {},
): CfnFirewallDomainList = CfnFirewallDomainList(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnFirewallDomainList(id: String, initializer: @AwsCdkDsl CfnFirewallDomainList.Builder.() -> Unit = {}): CfnFirewallDomainList = CfnFirewallDomainList.Builder.create(this, id).apply(initializer).build()
