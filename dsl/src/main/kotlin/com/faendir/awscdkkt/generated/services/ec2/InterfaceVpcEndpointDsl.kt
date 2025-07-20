package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.InterfaceVpcEndpoint
import software.amazon.awscdk.services.ec2.InterfaceVpcEndpointProps
import software.constructs.Construct

@Generated
public fun Construct.interfaceVpcEndpoint(
  id: String,
  props: InterfaceVpcEndpointProps,
  initializer: @AwsCdkDsl InterfaceVpcEndpoint.() -> Unit = {},
): InterfaceVpcEndpoint = InterfaceVpcEndpoint(this, id, props).apply(initializer)

@Generated
public fun Construct.buildInterfaceVpcEndpoint(id: String, initializer: @AwsCdkDsl InterfaceVpcEndpoint.Builder.() -> Unit = {}): InterfaceVpcEndpoint = InterfaceVpcEndpoint.Builder.create(this, id).apply(initializer).build()
