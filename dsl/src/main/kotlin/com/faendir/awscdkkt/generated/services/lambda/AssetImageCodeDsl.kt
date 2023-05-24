package com.faendir.awscdkkt.generated.services.lambda

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lambda.AssetImageCode

@Generated
public fun buildAssetImageCode(directory: String, initializer: @AwsCdkDsl
    AssetImageCode.Builder.() -> Unit): AssetImageCode =
    AssetImageCode.Builder.create(directory).apply(initializer).build()
