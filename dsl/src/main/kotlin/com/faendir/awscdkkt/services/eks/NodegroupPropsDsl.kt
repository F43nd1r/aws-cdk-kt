package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.NodegroupProps

@Generated
public fun nodegroupProps(initializer: NodegroupProps.Builder.() -> Unit = {}): NodegroupProps =
    NodegroupProps.builder().apply(initializer).build()
