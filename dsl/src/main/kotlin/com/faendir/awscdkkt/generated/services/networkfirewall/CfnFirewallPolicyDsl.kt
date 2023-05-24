package com.faendir.awscdkkt.generated.services.networkfirewall

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy
import software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnFirewallPolicy(id: String, props: CfnFirewallPolicyProps): CfnFirewallPolicy
    = CfnFirewallPolicy(this, id, props)

@Generated
public fun Construct.cfnFirewallPolicy(
  id: String,
  props: CfnFirewallPolicyProps,
  initializer: @AwsCdkDsl CfnFirewallPolicy.() -> Unit,
): CfnFirewallPolicy = CfnFirewallPolicy(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnFirewallPolicy(id: String, initializer: @AwsCdkDsl
    CfnFirewallPolicy.Builder.() -> Unit): CfnFirewallPolicy =
    CfnFirewallPolicy.Builder.create(this, id).apply(initializer).build()
