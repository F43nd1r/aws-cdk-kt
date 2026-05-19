package com.faendir.awscdkkt.generated.services.bedrockagentcore

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.bedrockagentcore.S3ApiSchema

@Generated
public fun buildS3ApiSchema(initializer: @AwsCdkDsl S3ApiSchema.Builder.() -> Unit = {}): S3ApiSchema = S3ApiSchema.Builder.create().apply(initializer).build()

@Generated
public fun buildS3ApiSchema(bucketOwnerAccountId: String, initializer: @AwsCdkDsl S3ApiSchema.Builder.() -> Unit = {}): S3ApiSchema = S3ApiSchema.Builder.create(bucketOwnerAccountId).apply(initializer).build()
