package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.BlockPublicAccessOptions

@Generated
public fun blockPublicAccessOptions(initializer: BlockPublicAccessOptions.Builder.() -> Unit = {}):
    BlockPublicAccessOptions = BlockPublicAccessOptions.builder().apply(initializer).build()
