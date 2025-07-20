package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnInternetGateway
import software.amazon.awscdk.services.ec2.CfnInternetGatewayProps
import software.constructs.Construct

@Generated
public fun Construct.cfnInternetGateway(id: String, initializer: @AwsCdkDsl CfnInternetGateway.() -> Unit = {}): CfnInternetGateway = CfnInternetGateway(this, id).apply(initializer)

@Generated
public fun Construct.cfnInternetGateway(
  id: String,
  props: CfnInternetGatewayProps,
  initializer: @AwsCdkDsl CfnInternetGateway.() -> Unit = {},
): CfnInternetGateway = CfnInternetGateway(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnInternetGateway(id: String, initializer: @AwsCdkDsl CfnInternetGateway.Builder.() -> Unit = {}): CfnInternetGateway = CfnInternetGateway.Builder.create(this, id).apply(initializer).build()
