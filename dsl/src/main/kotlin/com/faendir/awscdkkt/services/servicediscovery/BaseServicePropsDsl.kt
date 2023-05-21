package com.faendir.awscdkkt.services.servicediscovery

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.servicediscovery.BaseServiceProps

@Generated
public fun baseServiceProps(initializer: BaseServiceProps.Builder.() -> Unit = {}): BaseServiceProps
    = BaseServiceProps.builder().apply(initializer).build()
