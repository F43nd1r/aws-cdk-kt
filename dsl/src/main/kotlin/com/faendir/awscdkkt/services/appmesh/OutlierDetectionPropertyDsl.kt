@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

public
    fun outlierDetectionProperty(initializer: CfnVirtualNode.OutlierDetectionProperty.Builder.() -> Unit):
    CfnVirtualNode.OutlierDetectionProperty =
    CfnVirtualNode.OutlierDetectionProperty.builder().apply(initializer).build()
