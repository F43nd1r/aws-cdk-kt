package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@Generated
public
    fun outlierDetectionProperty(initializer: CfnVirtualNode.OutlierDetectionProperty.Builder.() -> Unit
    = {}): CfnVirtualNode.OutlierDetectionProperty =
    CfnVirtualNode.OutlierDetectionProperty.builder().apply(initializer).build()
