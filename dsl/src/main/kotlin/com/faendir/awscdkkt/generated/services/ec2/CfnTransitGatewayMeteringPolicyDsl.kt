package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnTransitGatewayMeteringPolicy
import software.amazon.awscdk.services.ec2.CfnTransitGatewayMeteringPolicyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTransitGatewayMeteringPolicy(
  id: String,
  props: CfnTransitGatewayMeteringPolicyProps,
  initializer: @AwsCdkDsl CfnTransitGatewayMeteringPolicy.() -> Unit = {},
): CfnTransitGatewayMeteringPolicy = CfnTransitGatewayMeteringPolicy(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTransitGatewayMeteringPolicy(id: String, initializer: @AwsCdkDsl CfnTransitGatewayMeteringPolicy.Builder.() -> Unit = {}): CfnTransitGatewayMeteringPolicy = CfnTransitGatewayMeteringPolicy.Builder.create(this, id).apply(initializer).build()
