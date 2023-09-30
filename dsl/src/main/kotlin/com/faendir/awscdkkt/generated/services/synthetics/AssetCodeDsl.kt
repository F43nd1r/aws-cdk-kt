package com.faendir.awscdkkt.generated.services.synthetics

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.synthetics.AssetCode

@Generated
public fun buildAssetCode(assetPath: String, initializer: @AwsCdkDsl AssetCode.Builder.() -> Unit =
    {}): AssetCode = AssetCode.Builder.create(assetPath).apply(initializer).build()
