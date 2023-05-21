package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.FirelensLogRouterDefinitionOptions

@Generated
public
    fun firelensLogRouterDefinitionOptions(initializer: FirelensLogRouterDefinitionOptions.Builder.() -> Unit
    = {}): FirelensLogRouterDefinitionOptions =
    FirelensLogRouterDefinitionOptions.builder().apply(initializer).build()
