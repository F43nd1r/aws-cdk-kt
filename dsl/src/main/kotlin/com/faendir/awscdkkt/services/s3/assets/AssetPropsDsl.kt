package com.faendir.awscdkkt.services.s3.assets

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.assets.AssetProps

@Generated
public fun assetProps(initializer: AssetProps.Builder.() -> Unit = {}): AssetProps =
    AssetProps.builder().apply(initializer).build()
