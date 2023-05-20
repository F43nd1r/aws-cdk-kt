@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.pipelines

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.pipelines.StackAsset

public fun stackAsset(initializer: StackAsset.Builder.() -> Unit): StackAsset =
    StackAsset.builder().apply(initializer).build()
