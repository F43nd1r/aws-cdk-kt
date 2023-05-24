package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint
import software.amazon.awscdk.services.ec2.CfnClientVpnEndpointProps
import software.constructs.Construct

@Generated
public fun Construct.cfnClientVpnEndpoint(id: String, props: CfnClientVpnEndpointProps):
    CfnClientVpnEndpoint = CfnClientVpnEndpoint(this, id, props)

@Generated
public fun Construct.cfnClientVpnEndpoint(
  id: String,
  props: CfnClientVpnEndpointProps,
  initializer: @AwsCdkDsl CfnClientVpnEndpoint.() -> Unit,
): CfnClientVpnEndpoint = CfnClientVpnEndpoint(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnClientVpnEndpoint(id: String, initializer: @AwsCdkDsl
    CfnClientVpnEndpoint.Builder.() -> Unit): CfnClientVpnEndpoint =
    CfnClientVpnEndpoint.Builder.create(this, id).apply(initializer).build()
