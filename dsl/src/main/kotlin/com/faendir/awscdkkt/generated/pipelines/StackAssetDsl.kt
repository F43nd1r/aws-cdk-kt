package com.faendir.awscdkkt.generated.pipelines

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.pipelines.StackAsset

@Generated
public fun buildStackAsset(initializer: @AwsCdkDsl StackAsset.Builder.() -> Unit = {}): StackAsset =
    StackAsset.Builder().apply(initializer).build()
