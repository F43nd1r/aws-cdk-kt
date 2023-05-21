package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.OutlierDetection

@Generated
public fun outlierDetection(initializer: OutlierDetection.Builder.() -> Unit = {}): OutlierDetection
    = OutlierDetection.builder().apply(initializer).build()
