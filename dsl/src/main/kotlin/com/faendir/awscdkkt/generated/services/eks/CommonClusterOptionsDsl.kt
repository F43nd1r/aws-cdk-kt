package com.faendir.awscdkkt.generated.services.eks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.CommonClusterOptions

@Generated
public fun buildCommonClusterOptions(initializer: @AwsCdkDsl
    CommonClusterOptions.Builder.() -> Unit): CommonClusterOptions =
    CommonClusterOptions.Builder().apply(initializer).build()
