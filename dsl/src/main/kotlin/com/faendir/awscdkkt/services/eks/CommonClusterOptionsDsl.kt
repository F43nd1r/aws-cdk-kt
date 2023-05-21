package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.CommonClusterOptions

@Generated
public fun commonClusterOptions(initializer: CommonClusterOptions.Builder.() -> Unit = {}):
    CommonClusterOptions = CommonClusterOptions.builder().apply(initializer).build()
