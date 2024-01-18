package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.ContainerMountPoint

@Generated
public fun buildContainerMountPoint(initializer: @AwsCdkDsl ContainerMountPoint.Builder.() -> Unit =
    {}): ContainerMountPoint = ContainerMountPoint.Builder().apply(initializer).build()
