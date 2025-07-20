package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnInstanceConnectEndpoint
import software.amazon.awscdk.services.ec2.CfnInstanceConnectEndpointProps
import software.constructs.Construct

@Generated
public fun Construct.cfnInstanceConnectEndpoint(
  id: String,
  props: CfnInstanceConnectEndpointProps,
  initializer: @AwsCdkDsl CfnInstanceConnectEndpoint.() -> Unit = {},
): CfnInstanceConnectEndpoint = CfnInstanceConnectEndpoint(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnInstanceConnectEndpoint(id: String, initializer: @AwsCdkDsl CfnInstanceConnectEndpoint.Builder.() -> Unit = {}): CfnInstanceConnectEndpoint = CfnInstanceConnectEndpoint.Builder.create(this, id).apply(initializer).build()
