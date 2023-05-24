package com.faendir.awscdkkt.generated.services.s3

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.BlockPublicAccess
import software.amazon.awscdk.services.s3.BlockPublicAccessOptions

@Generated
public fun blockPublicAccess(options: BlockPublicAccessOptions): BlockPublicAccess =
    BlockPublicAccess(options)

@Generated
public fun buildBlockPublicAccess(initializer: @AwsCdkDsl BlockPublicAccess.Builder.() -> Unit):
    BlockPublicAccess = BlockPublicAccess.Builder.create().apply(initializer).build()
