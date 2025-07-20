package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnEgressOnlyInternetGateway
import software.amazon.awscdk.services.ec2.CfnEgressOnlyInternetGatewayProps
import software.constructs.Construct

@Generated
public fun Construct.cfnEgressOnlyInternetGateway(
  id: String,
  props: CfnEgressOnlyInternetGatewayProps,
  initializer: @AwsCdkDsl CfnEgressOnlyInternetGateway.() -> Unit = {},
): CfnEgressOnlyInternetGateway = CfnEgressOnlyInternetGateway(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnEgressOnlyInternetGateway(id: String, initializer: @AwsCdkDsl CfnEgressOnlyInternetGateway.Builder.() -> Unit = {}): CfnEgressOnlyInternetGateway = CfnEgressOnlyInternetGateway.Builder.create(this, id).apply(initializer).build()
