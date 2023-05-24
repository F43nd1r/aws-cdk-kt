package com.faendir.awscdkkt.generated.services.eks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.NodegroupOptions

@Generated
public fun buildNodegroupOptions(initializer: @AwsCdkDsl NodegroupOptions.Builder.() -> Unit):
    NodegroupOptions = NodegroupOptions.Builder().apply(initializer).build()
