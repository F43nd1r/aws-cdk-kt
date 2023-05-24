package com.faendir.awscdkkt.generated.services.appsync

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appsync.AssetCode

@Generated
public fun buildAssetCode(path: String, initializer: @AwsCdkDsl AssetCode.Builder.() -> Unit):
    AssetCode = AssetCode.Builder.create(path).apply(initializer).build()
