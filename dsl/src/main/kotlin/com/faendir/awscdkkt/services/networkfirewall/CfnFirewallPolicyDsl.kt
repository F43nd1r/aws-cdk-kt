@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.networkfirewall

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy
import software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicyProps
import software.constructs.Construct

public fun Construct.cfnFirewallPolicy(
  id: String,
  props: CfnFirewallPolicyProps,
  initializer: CfnFirewallPolicy.() -> Unit = {},
): CfnFirewallPolicy = CfnFirewallPolicy(this, id, props).apply(initializer)
