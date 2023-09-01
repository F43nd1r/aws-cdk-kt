package com.faendir.awscdkkt.generated.pipelines

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.pipelines.Wave

@Generated
public fun buildWave(id: String, initializer: @AwsCdkDsl Wave.Builder.() -> Unit = {}): Wave =
    Wave.Builder.create(id).apply(initializer).build()
