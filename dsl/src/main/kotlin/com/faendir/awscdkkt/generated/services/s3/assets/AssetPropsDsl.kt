package com.faendir.awscdkkt.generated.services.s3.assets

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.assets.AssetProps

@Generated
public fun buildAssetProps(initializer: @AwsCdkDsl AssetProps.Builder.() -> Unit = {}): AssetProps =
    AssetProps.Builder().apply(initializer).build()
