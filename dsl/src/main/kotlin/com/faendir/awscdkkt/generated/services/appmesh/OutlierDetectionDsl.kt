package com.faendir.awscdkkt.generated.services.appmesh

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.OutlierDetection

@Generated
public fun buildOutlierDetection(initializer: @AwsCdkDsl OutlierDetection.Builder.() -> Unit = {}):
    OutlierDetection = OutlierDetection.Builder().apply(initializer).build()
