package com.faendir.awscdkkt.generated.services.route53resolver

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53resolver.CfnFirewallDomainList
import software.amazon.awscdk.services.route53resolver.CfnFirewallDomainListProps
import software.constructs.Construct

@Generated
public fun Construct.cfnFirewallDomainList(id: String, props: CfnFirewallDomainListProps):
    CfnFirewallDomainList = CfnFirewallDomainList(this, id, props)

@Generated
public fun Construct.cfnFirewallDomainList(
  id: String,
  props: CfnFirewallDomainListProps,
  initializer: @AwsCdkDsl CfnFirewallDomainList.() -> Unit,
): CfnFirewallDomainList = CfnFirewallDomainList(this, id, props).apply(initializer)

@Generated
public fun Construct.cfnFirewallDomainList(id: String): CfnFirewallDomainList =
    CfnFirewallDomainList(this, id)

@Generated
public fun Construct.cfnFirewallDomainList(id: String, initializer: @AwsCdkDsl
    CfnFirewallDomainList.() -> Unit): CfnFirewallDomainList = CfnFirewallDomainList(this,
    id).apply(initializer)

@Generated
public fun Construct.buildCfnFirewallDomainList(id: String, initializer: @AwsCdkDsl
    CfnFirewallDomainList.Builder.() -> Unit): CfnFirewallDomainList =
    CfnFirewallDomainList.Builder.create(this, id).apply(initializer).build()
