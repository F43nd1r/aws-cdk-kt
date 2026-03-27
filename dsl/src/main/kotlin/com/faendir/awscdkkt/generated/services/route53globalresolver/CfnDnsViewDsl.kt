package com.faendir.awscdkkt.generated.services.route53globalresolver

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53globalresolver.CfnDnsView
import software.amazon.awscdk.services.route53globalresolver.CfnDnsViewProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDnsView(
  id: String,
  props: CfnDnsViewProps,
  initializer: @AwsCdkDsl CfnDnsView.() -> Unit = {},
): CfnDnsView = CfnDnsView(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDnsView(id: String, initializer: @AwsCdkDsl CfnDnsView.Builder.() -> Unit = {}): CfnDnsView = CfnDnsView.Builder.create(this, id).apply(initializer).build()
