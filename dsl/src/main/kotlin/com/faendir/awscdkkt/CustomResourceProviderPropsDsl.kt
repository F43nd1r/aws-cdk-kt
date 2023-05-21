package com.faendir.awscdkkt

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.CustomResourceProviderProps

@Generated
public fun customResourceProviderProps(initializer: CustomResourceProviderProps.Builder.() -> Unit =
    {}): CustomResourceProviderProps =
    CustomResourceProviderProps.builder().apply(initializer).build()
