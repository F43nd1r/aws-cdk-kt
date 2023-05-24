package com.faendir.awscdkkt.generated.services.lambda

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lambda.AssetCode
import software.amazon.awscdk.services.s3.assets.AssetOptions

@Generated
public fun assetCode(path: String, options: AssetOptions): AssetCode = AssetCode(path, options)

@Generated
public fun assetCode(path: String): AssetCode = AssetCode(path)

@Generated
public fun buildAssetCode(path: String, initializer: @AwsCdkDsl AssetCode.Builder.() -> Unit):
    AssetCode = AssetCode.Builder.create(path).apply(initializer).build()
