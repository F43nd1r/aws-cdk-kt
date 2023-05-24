package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.AssetEnvironmentFile
import software.amazon.awscdk.services.s3.assets.AssetOptions

@Generated
public fun assetEnvironmentFile(path: String): AssetEnvironmentFile = AssetEnvironmentFile(path)

@Generated
public fun assetEnvironmentFile(path: String, options: AssetOptions): AssetEnvironmentFile =
    AssetEnvironmentFile(path, options)

@Generated
public fun buildAssetEnvironmentFile(path: String, initializer: @AwsCdkDsl
    AssetEnvironmentFile.Builder.() -> Unit): AssetEnvironmentFile =
    AssetEnvironmentFile.Builder.create(path).apply(initializer).build()
