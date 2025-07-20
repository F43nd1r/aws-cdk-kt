package com.faendir.awscdkkt.generated.services.cloudfront

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.AssetImportSource

@Generated
public fun buildAssetImportSource(path: String, initializer: @AwsCdkDsl AssetImportSource.Builder.() -> Unit = {}): AssetImportSource = AssetImportSource.Builder.create(path).apply(initializer).build()
