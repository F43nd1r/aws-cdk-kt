package com.faendir.awscdkkt.generated.services.synthetics

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.synthetics.CustomTestOptions

@Generated
public fun buildCustomTestOptions(initializer: @AwsCdkDsl CustomTestOptions.Builder.() -> Unit =
    {}): CustomTestOptions = CustomTestOptions.Builder().apply(initializer).build()
