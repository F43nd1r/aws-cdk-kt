package com.faendir.awscdkkt.generated.services.eks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.BootstrapOptions

@Generated
public fun buildBootstrapOptions(initializer: @AwsCdkDsl BootstrapOptions.Builder.() -> Unit):
    BootstrapOptions = BootstrapOptions.Builder().apply(initializer).build()
