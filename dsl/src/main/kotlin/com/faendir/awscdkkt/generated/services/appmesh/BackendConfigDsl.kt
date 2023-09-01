package com.faendir.awscdkkt.generated.services.appmesh

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.BackendConfig

@Generated
public fun buildBackendConfig(initializer: @AwsCdkDsl BackendConfig.Builder.() -> Unit = {}):
    BackendConfig = BackendConfig.Builder().apply(initializer).build()
