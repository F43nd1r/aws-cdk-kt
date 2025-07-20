package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.AssetEnvironmentFile

@Generated
public fun buildAssetEnvironmentFile(path: String, initializer: @AwsCdkDsl AssetEnvironmentFile.Builder.() -> Unit = {}): AssetEnvironmentFile = AssetEnvironmentFile.Builder.create(path).apply(initializer).build()
