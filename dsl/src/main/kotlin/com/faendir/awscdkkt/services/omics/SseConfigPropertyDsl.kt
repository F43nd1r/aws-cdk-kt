@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.omics

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.omics.CfnVariantStore

public fun sseConfigProperty(initializer: CfnVariantStore.SseConfigProperty.Builder.() -> Unit):
    CfnVariantStore.SseConfigProperty =
    CfnVariantStore.SseConfigProperty.builder().apply(initializer).build()
