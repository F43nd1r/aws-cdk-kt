@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.s3.assets

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.assets.AssetOptions

public fun assetOptions(initializer: AssetOptions.Builder.() -> Unit): AssetOptions =
    AssetOptions.builder().apply(initializer).build()
