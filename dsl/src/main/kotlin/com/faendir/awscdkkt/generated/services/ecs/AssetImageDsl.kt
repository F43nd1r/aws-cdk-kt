package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.AssetImage
import software.amazon.awscdk.services.ecs.AssetImageProps

@Generated
public fun assetImage(directory: String): AssetImage = AssetImage(directory)

@Generated
public fun assetImage(directory: String, props: AssetImageProps): AssetImage = AssetImage(directory,
    props)

@Generated
public fun buildAssetImage(directory: String, initializer: @AwsCdkDsl
    AssetImage.Builder.() -> Unit): AssetImage =
    AssetImage.Builder.create(directory).apply(initializer).build()
