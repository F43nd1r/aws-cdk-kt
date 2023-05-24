package com.faendir.awscdkkt.generated

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.BootstraplessSynthesizer
import software.amazon.awscdk.BootstraplessSynthesizerProps

@Generated
public fun bootstraplessSynthesizer(props: BootstraplessSynthesizerProps): BootstraplessSynthesizer
    = BootstraplessSynthesizer(props)

@Generated
public fun buildBootstraplessSynthesizer(initializer: @AwsCdkDsl
    BootstraplessSynthesizer.Builder.() -> Unit): BootstraplessSynthesizer =
    BootstraplessSynthesizer.Builder.create().apply(initializer).build()
