package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.ServiceConnectService

@Generated
public fun buildServiceConnectService(initializer: @AwsCdkDsl
    ServiceConnectService.Builder.() -> Unit = {}): ServiceConnectService =
    ServiceConnectService.Builder().apply(initializer).build()
