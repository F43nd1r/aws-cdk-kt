package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnVPCEndpointService
import software.amazon.awscdk.services.ec2.CfnVPCEndpointServiceProps
import software.constructs.Construct

@Generated
public fun Construct.cfnVPCEndpointService(id: String, initializer: @AwsCdkDsl
    CfnVPCEndpointService.() -> Unit = {}): CfnVPCEndpointService = CfnVPCEndpointService(this,
    id).apply(initializer)

@Generated
public fun Construct.cfnVPCEndpointService(
  id: String,
  props: CfnVPCEndpointServiceProps,
  initializer: @AwsCdkDsl CfnVPCEndpointService.() -> Unit = {},
): CfnVPCEndpointService = CfnVPCEndpointService(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnVPCEndpointService(id: String, initializer: @AwsCdkDsl
    CfnVPCEndpointService.Builder.() -> Unit = {}): CfnVPCEndpointService =
    CfnVPCEndpointService.Builder.create(this, id).apply(initializer).build()
