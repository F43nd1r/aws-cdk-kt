package com.faendir.awscdkkt.generated.services.route53resolver

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53resolver.CfnFirewallConfig
import software.amazon.awscdk.services.route53resolver.CfnFirewallConfigProps
import software.constructs.Construct

@Generated
public fun Construct.cfnFirewallConfig(id: String, initializer: @AwsCdkDsl CfnFirewallConfig.() -> Unit = {}): CfnFirewallConfig = CfnFirewallConfig(this, id).apply(initializer)

@Generated
public fun Construct.cfnFirewallConfig(
  id: String,
  props: CfnFirewallConfigProps,
  initializer: @AwsCdkDsl CfnFirewallConfig.() -> Unit = {},
): CfnFirewallConfig = CfnFirewallConfig(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnFirewallConfig(id: String, initializer: @AwsCdkDsl CfnFirewallConfig.Builder.() -> Unit = {}): CfnFirewallConfig = CfnFirewallConfig.Builder.create(this, id).apply(initializer).build()
