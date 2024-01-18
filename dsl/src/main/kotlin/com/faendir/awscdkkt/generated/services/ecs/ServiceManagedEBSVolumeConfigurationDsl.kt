package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.ServiceManagedEBSVolumeConfiguration

@Generated
public fun buildServiceManagedEBSVolumeConfiguration(initializer: @AwsCdkDsl
    ServiceManagedEBSVolumeConfiguration.Builder.() -> Unit = {}):
    ServiceManagedEBSVolumeConfiguration =
    ServiceManagedEBSVolumeConfiguration.Builder().apply(initializer).build()
