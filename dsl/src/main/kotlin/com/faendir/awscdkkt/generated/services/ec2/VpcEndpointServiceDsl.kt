package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.VpcEndpointService
import software.amazon.awscdk.services.ec2.VpcEndpointServiceProps
import software.constructs.Construct

@Generated
public fun Construct.vpcEndpointService(id: String, props: VpcEndpointServiceProps):
    VpcEndpointService = VpcEndpointService(this, id, props)

@Generated
public fun Construct.vpcEndpointService(
  id: String,
  props: VpcEndpointServiceProps,
  initializer: @AwsCdkDsl VpcEndpointService.() -> Unit,
): VpcEndpointService = VpcEndpointService(this, id, props).apply(initializer)

@Generated
public fun Construct.buildVpcEndpointService(id: String, initializer: @AwsCdkDsl
    VpcEndpointService.Builder.() -> Unit): VpcEndpointService =
    VpcEndpointService.Builder.create(this, id).apply(initializer).build()
