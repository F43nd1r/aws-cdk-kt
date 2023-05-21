package com.faendir.awscdkkt.pipelines

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.pipelines.ECRSourceOptions

@Generated
public fun eCRSourceOptions(initializer: ECRSourceOptions.Builder.() -> Unit = {}): ECRSourceOptions
    = ECRSourceOptions.builder().apply(initializer).build()
