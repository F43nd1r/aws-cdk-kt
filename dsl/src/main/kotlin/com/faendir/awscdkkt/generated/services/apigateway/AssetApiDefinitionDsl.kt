package com.faendir.awscdkkt.generated.services.apigateway

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.AssetApiDefinition
import software.amazon.awscdk.services.s3.assets.AssetOptions

@Generated
public fun assetApiDefinition(path: String): AssetApiDefinition = AssetApiDefinition(path)

@Generated
public fun assetApiDefinition(path: String, options: AssetOptions): AssetApiDefinition =
    AssetApiDefinition(path, options)

@Generated
public fun buildAssetApiDefinition(path: String, initializer: @AwsCdkDsl
    AssetApiDefinition.Builder.() -> Unit): AssetApiDefinition =
    AssetApiDefinition.Builder.create(path).apply(initializer).build()
