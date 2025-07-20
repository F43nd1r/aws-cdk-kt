package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.AssetImage

@Generated
public fun buildAssetImage(directory: String, initializer: @AwsCdkDsl AssetImage.Builder.() -> Unit = {}): AssetImage = AssetImage.Builder.create(directory).apply(initializer).build()
