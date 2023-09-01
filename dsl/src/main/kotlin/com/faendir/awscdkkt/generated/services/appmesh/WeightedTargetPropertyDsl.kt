package com.faendir.awscdkkt.generated.services.appmesh

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnRoute

@Generated
public fun buildWeightedTargetProperty(initializer: @AwsCdkDsl
    CfnRoute.WeightedTargetProperty.Builder.() -> Unit = {}): CfnRoute.WeightedTargetProperty =
    CfnRoute.WeightedTargetProperty.Builder().apply(initializer).build()
