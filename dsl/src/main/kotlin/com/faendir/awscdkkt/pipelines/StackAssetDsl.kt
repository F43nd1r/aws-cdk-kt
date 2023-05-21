package com.faendir.awscdkkt.pipelines

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.pipelines.StackAsset

@Generated
public fun stackAsset(initializer: StackAsset.Builder.() -> Unit = {}): StackAsset =
    StackAsset.builder().apply(initializer).build()
