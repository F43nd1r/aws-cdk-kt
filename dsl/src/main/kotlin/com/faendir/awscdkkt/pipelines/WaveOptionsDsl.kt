package com.faendir.awscdkkt.pipelines

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.pipelines.WaveOptions

@Generated
public fun waveOptions(initializer: WaveOptions.Builder.() -> Unit = {}): WaveOptions =
    WaveOptions.builder().apply(initializer).build()
