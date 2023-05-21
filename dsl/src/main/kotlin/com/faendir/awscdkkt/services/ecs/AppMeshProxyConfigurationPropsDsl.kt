package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.AppMeshProxyConfigurationProps

@Generated
public
    fun appMeshProxyConfigurationProps(initializer: AppMeshProxyConfigurationProps.Builder.() -> Unit
    = {}): AppMeshProxyConfigurationProps =
    AppMeshProxyConfigurationProps.builder().apply(initializer).build()
