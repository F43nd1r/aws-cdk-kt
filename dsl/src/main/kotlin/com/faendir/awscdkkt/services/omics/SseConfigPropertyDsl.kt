package com.faendir.awscdkkt.services.omics

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.omics.CfnVariantStore

@Generated
public fun sseConfigProperty(initializer: CfnVariantStore.SseConfigProperty.Builder.() -> Unit =
    {}): CfnVariantStore.SseConfigProperty =
    CfnVariantStore.SseConfigProperty.builder().apply(initializer).build()
