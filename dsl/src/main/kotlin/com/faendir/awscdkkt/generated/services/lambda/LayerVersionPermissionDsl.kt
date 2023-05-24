package com.faendir.awscdkkt.generated.services.lambda

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.LayerVersionPermission

@Generated
public fun buildLayerVersionPermission(initializer: @AwsCdkDsl
    LayerVersionPermission.Builder.() -> Unit): LayerVersionPermission =
    LayerVersionPermission.Builder().apply(initializer).build()
