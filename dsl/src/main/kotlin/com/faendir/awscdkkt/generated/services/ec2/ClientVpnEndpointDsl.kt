package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.ClientVpnEndpoint
import software.amazon.awscdk.services.ec2.ClientVpnEndpointProps
import software.constructs.Construct

@Generated
public fun Construct.clientVpnEndpoint(
  id: String,
  props: ClientVpnEndpointProps,
  initializer: @AwsCdkDsl ClientVpnEndpoint.() -> Unit = {},
): ClientVpnEndpoint = ClientVpnEndpoint(this, id, props).apply(initializer)

@Generated
public fun Construct.buildClientVpnEndpoint(id: String, initializer: @AwsCdkDsl ClientVpnEndpoint.Builder.() -> Unit = {}): ClientVpnEndpoint = ClientVpnEndpoint.Builder.create(this, id).apply(initializer).build()
