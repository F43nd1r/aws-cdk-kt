package com.faendir.awscdkkt.generated.services.globalaccelerator.endpoints

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.IInstance
import software.amazon.awscdk.services.globalaccelerator.endpoints.InstanceEndpoint
import software.amazon.awscdk.services.globalaccelerator.endpoints.InstanceEndpointProps

@Generated
public fun instanceEndpoint(instance: IInstance): InstanceEndpoint = InstanceEndpoint(instance)

@Generated
public fun instanceEndpoint(instance: IInstance, options: InstanceEndpointProps): InstanceEndpoint =
    InstanceEndpoint(instance, options)

@Generated
public fun buildInstanceEndpoint(instance: IInstance, initializer: @AwsCdkDsl
    InstanceEndpoint.Builder.() -> Unit): InstanceEndpoint =
    InstanceEndpoint.Builder.create(instance).apply(initializer).build()
