package com.faendir.awscdkkt.customresources

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.customresources.ProviderProps

@Generated
public fun providerProps(initializer: ProviderProps.Builder.() -> Unit = {}): ProviderProps =
    ProviderProps.builder().apply(initializer).build()
