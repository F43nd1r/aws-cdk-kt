package com.faendir.awscdkkt.services.networkfirewall

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy
import software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnFirewallPolicy(
  id: String,
  props: CfnFirewallPolicyProps,
  initializer: CfnFirewallPolicy.() -> Unit = {},
): CfnFirewallPolicy = CfnFirewallPolicy(this, id, props).apply(initializer)
