@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.networkfirewall

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.networkfirewall.CfnFirewall
import software.amazon.awscdk.services.networkfirewall.CfnFirewallProps
import software.constructs.Construct

public fun Construct.cfnFirewall(
  id: String,
  props: CfnFirewallProps,
  initializer: CfnFirewall.() -> Unit = {},
): CfnFirewall = CfnFirewall(this, id, props).apply(initializer)
