package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.ServiceManagedVolume
import software.amazon.awscdk.services.ecs.ServiceManagedVolumeProps
import software.constructs.Construct

@Generated
public fun Construct.serviceManagedVolume(
  id: String,
  props: ServiceManagedVolumeProps,
  initializer: @AwsCdkDsl ServiceManagedVolume.() -> Unit = {},
): ServiceManagedVolume = ServiceManagedVolume(this, id, props).apply(initializer)

@Generated
public fun Construct.buildServiceManagedVolume(id: String, initializer: @AwsCdkDsl
    ServiceManagedVolume.Builder.() -> Unit = {}): ServiceManagedVolume =
    ServiceManagedVolume.Builder.create(this, id).apply(initializer).build()
