package com.faendir.awscdkkt.generated.services.bedrockagentcore

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.bedrockagentcore.S3ToolSchema

@Generated
public fun buildS3ToolSchema(initializer: @AwsCdkDsl S3ToolSchema.Builder.() -> Unit = {}): S3ToolSchema = S3ToolSchema.Builder.create().apply(initializer).build()

@Generated
public fun buildS3ToolSchema(bucketOwnerAccountId: String, initializer: @AwsCdkDsl S3ToolSchema.Builder.() -> Unit = {}): S3ToolSchema = S3ToolSchema.Builder.create(bucketOwnerAccountId).apply(initializer).build()
