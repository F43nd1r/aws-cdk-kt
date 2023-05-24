package com.faendir.awscdkkt.generated.services.lambda

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lambda.AssetCode

@Generated
public fun buildAssetCode(path: String, initializer: @AwsCdkDsl AssetCode.Builder.() -> Unit):
    AssetCode = AssetCode.Builder.create(path).apply(initializer).build()
