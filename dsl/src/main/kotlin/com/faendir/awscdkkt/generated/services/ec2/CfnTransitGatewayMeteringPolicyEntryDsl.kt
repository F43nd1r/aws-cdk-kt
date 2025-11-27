package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnTransitGatewayMeteringPolicyEntry
import software.amazon.awscdk.services.ec2.CfnTransitGatewayMeteringPolicyEntryProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTransitGatewayMeteringPolicyEntry(
  id: String,
  props: CfnTransitGatewayMeteringPolicyEntryProps,
  initializer: @AwsCdkDsl CfnTransitGatewayMeteringPolicyEntry.() -> Unit = {},
): CfnTransitGatewayMeteringPolicyEntry = CfnTransitGatewayMeteringPolicyEntry(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTransitGatewayMeteringPolicyEntry(id: String, initializer: @AwsCdkDsl CfnTransitGatewayMeteringPolicyEntry.Builder.() -> Unit = {}): CfnTransitGatewayMeteringPolicyEntry = CfnTransitGatewayMeteringPolicyEntry.Builder.create(this, id).apply(initializer).build()
