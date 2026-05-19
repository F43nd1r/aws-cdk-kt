package com.faendir.awscdkkt.generated.services.bedrockagentcore

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.bedrockagentcore.AssetApiSchema

@Generated
public fun buildAssetApiSchema(path: String, initializer: @AwsCdkDsl AssetApiSchema.Builder.() -> Unit = {}): AssetApiSchema = AssetApiSchema.Builder.create(path).apply(initializer).build()
