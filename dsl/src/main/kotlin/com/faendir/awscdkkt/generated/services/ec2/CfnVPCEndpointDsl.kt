package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnVPCEndpoint
import software.amazon.awscdk.services.ec2.CfnVPCEndpointProps
import software.constructs.Construct

@Generated
public fun Construct.cfnVPCEndpoint(id: String, props: CfnVPCEndpointProps): CfnVPCEndpoint =
    CfnVPCEndpoint(this, id, props)

@Generated
public fun Construct.cfnVPCEndpoint(
  id: String,
  props: CfnVPCEndpointProps,
  initializer: @AwsCdkDsl CfnVPCEndpoint.() -> Unit,
): CfnVPCEndpoint = CfnVPCEndpoint(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnVPCEndpoint(id: String, initializer: @AwsCdkDsl
    CfnVPCEndpoint.Builder.() -> Unit): CfnVPCEndpoint = CfnVPCEndpoint.Builder.create(this,
    id).apply(initializer).build()
