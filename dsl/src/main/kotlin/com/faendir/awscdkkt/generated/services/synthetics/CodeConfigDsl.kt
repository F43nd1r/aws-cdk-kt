package com.faendir.awscdkkt.generated.services.synthetics

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.synthetics.CodeConfig

@Generated
public fun buildCodeConfig(initializer: @AwsCdkDsl CodeConfig.Builder.() -> Unit = {}): CodeConfig =
    CodeConfig.Builder().apply(initializer).build()
