package com.faendir.awscdkkt.generated.services.networkfirewall

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.networkfirewall.CfnFirewall
import software.amazon.awscdk.services.networkfirewall.CfnFirewallProps
import software.constructs.Construct

@Generated
public fun Construct.cfnFirewall(
  id: String,
  props: CfnFirewallProps,
  initializer: @AwsCdkDsl CfnFirewall.() -> Unit = {},
): CfnFirewall = CfnFirewall(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnFirewall(id: String, initializer: @AwsCdkDsl
    CfnFirewall.Builder.() -> Unit = {}): CfnFirewall = CfnFirewall.Builder.create(this,
    id).apply(initializer).build()
