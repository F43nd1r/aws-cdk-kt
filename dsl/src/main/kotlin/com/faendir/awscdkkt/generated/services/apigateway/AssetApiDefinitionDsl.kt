package com.faendir.awscdkkt.generated.services.apigateway

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.AssetApiDefinition

@Generated
public fun buildAssetApiDefinition(path: String, initializer: @AwsCdkDsl
    AssetApiDefinition.Builder.() -> Unit): AssetApiDefinition =
    AssetApiDefinition.Builder.create(path).apply(initializer).build()
