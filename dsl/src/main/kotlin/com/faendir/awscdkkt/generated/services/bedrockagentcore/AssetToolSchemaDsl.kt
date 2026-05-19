package com.faendir.awscdkkt.generated.services.bedrockagentcore

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.bedrockagentcore.AssetToolSchema

@Generated
public fun buildAssetToolSchema(path: String, initializer: @AwsCdkDsl AssetToolSchema.Builder.() -> Unit = {}): AssetToolSchema = AssetToolSchema.Builder.create(path).apply(initializer).build()
