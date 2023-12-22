package com.faendir.awscdkkt.generated

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.CustomResourceProviderOptions

@Generated
public fun buildCustomResourceProviderOptions(initializer: @AwsCdkDsl
    CustomResourceProviderOptions.Builder.() -> Unit = {}): CustomResourceProviderOptions =
    CustomResourceProviderOptions.Builder().apply(initializer).build()
